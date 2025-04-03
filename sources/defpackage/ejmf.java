package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmf implements Parcelable {
    public final int a;
    public boolean b;
    emxc c;
    public Object d;
    public Object e;
    private Throwable g;
    private ejme h;
    private static final enru f = enru.c("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator<ejmf> CREATOR = new ejmd();

    public ejmf(int i, Object obj, ListenableFuture listenableFuture) {
        this.c = emux.a;
        this.a = i;
        this.d = obj;
        erqt.r(listenableFuture, eldl.i(new ejmc(this)), erpp.a);
    }

    private static void d(Object obj, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(dataPosition);
            ((enrr) ((enrr) ((enrr) f.i()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).q("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        ejme ejmeVar = this.h;
        if (ejmeVar != null) {
            final Throwable th = this.g;
            if (th != null) {
                final ejmb ejmbVar = (ejmb) ejmeVar;
                ejmbVar.a.execute(eldl.l(new Runnable() { // from class: ejma
                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable th2 = th;
                        ejmb ejmbVar2 = ejmb.this;
                        if (ejmbVar2.e) {
                            ejmf ejmfVar = this;
                            if (ejmbVar2.c.remove(ejmfVar)) {
                                ejlr ejlrVar = (ejlr) ejmbVar2.b.b(ejmfVar.a);
                                ekzz g = eleg.g("onFailure FuturesMixin", elad.a);
                                try {
                                    ejlrVar.m(ejmfVar.d, th2);
                                    g.close();
                                } catch (Throwable th3) {
                                    try {
                                        g.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        }
                    }
                }));
            } else {
                final Object obj = this.e;
                final ejmb ejmbVar2 = (ejmb) ejmeVar;
                ejmbVar2.a.execute(eldl.l(new Runnable() { // from class: ejly
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj2 = obj;
                        ejmb ejmbVar3 = ejmb.this;
                        if (ejmbVar3.e) {
                            ejmf ejmfVar = this;
                            if (ejmbVar3.c.remove(ejmfVar)) {
                                ejlr ejlrVar = (ejlr) ejmbVar3.b.b(ejmfVar.a);
                                ekzz g = eleg.g("onSuccess FuturesMixin", elad.a);
                                try {
                                    ejlrVar.c(ejmfVar.d, obj2);
                                    g.close();
                                } catch (Throwable th2) {
                                    try {
                                        g.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                }));
            }
        }
    }

    final void b(Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    final void c(ejme ejmeVar) {
        this.h = ejmeVar;
        if (ejmeVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.d;
        String str3 = "";
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = "";
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ";";
        } else {
            str2 = "";
        }
        Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ";";
        }
        return "ParcelableFuture(" + str + str2 + str3 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            d(this.d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        parcel.writeInt(true != this.b ? 2 : 1);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public ejmf(Parcel parcel) {
        this.c = emux.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            this.c = emxc.j(Integer.valueOf(readInt));
            if (readInt == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) f.i()).g(e)).h("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).r("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }
}
