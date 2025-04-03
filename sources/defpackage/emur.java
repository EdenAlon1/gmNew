package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emur implements Parcelable {
    public static final Parcelable.Creator<emur> CREATOR = new emup();
    public final int a;
    public final Object b;
    public ListenableFuture c;
    private emuq d;

    public emur(int i, Object obj, ListenableFuture listenableFuture) {
        this.a = i;
        this.b = obj;
        this.c = listenableFuture;
    }

    public final void a() {
        emuq emuqVar = this.d;
        if (emuqVar == null || !c()) {
            return;
        }
        try {
            final Object q = erqt.q(this.c);
            final emun emunVar = (emun) emuqVar;
            ((emun) emuqVar).c(this, new Runnable() { // from class: emui
                @Override // java.lang.Runnable
                public final void run() {
                    emun emunVar2 = emun.this;
                    cpo cpoVar = emunVar2.a;
                    final emur emurVar = this;
                    final emtz emtzVar = (emtz) cpp.a(cpoVar, emurVar.a);
                    final Object obj = q;
                    emunVar2.a(new Runnable() { // from class: emuf
                        @Override // java.lang.Runnable
                        public final void run() {
                            emtz.this.b(emurVar.b, obj);
                        }
                    });
                }
            });
        } catch (Error e) {
            e = e;
            emuqVar.b(this, e);
        } catch (RuntimeException e2) {
            e = e2;
            emuqVar.b(this, e);
        } catch (ExecutionException e3) {
            emuqVar.b(this, e3.getCause());
        }
    }

    final void b(emuq emuqVar) {
        this.d = emuqVar;
        a();
    }

    final boolean c() {
        return this.c.isDone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        Object obj = this.b;
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = "";
        }
        return "ParcelableFuture(" + str + "future=" + String.valueOf(this.c) + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            int r9 = r7.a
            r8.writeInt(r9)
            boolean r9 = r7.c()
            r0 = 1
            r1 = 2
            r2 = 0
            if (r9 == 0) goto L25
            com.google.common.util.concurrent.ListenableFuture r9 = r7.c     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L1a java.util.concurrent.ExecutionException -> L1c
            java.lang.Object r9 = defpackage.erqt.q(r9)     // Catch: java.lang.Error -> L18 java.lang.RuntimeException -> L1a java.util.concurrent.ExecutionException -> L1c
            r3 = r9
            r9 = r0
            r4 = r2
            goto L28
        L18:
            r9 = move-exception
            goto L21
        L1a:
            r9 = move-exception
            goto L21
        L1c:
            r9 = move-exception
            java.lang.Throwable r9 = r9.getCause()
        L21:
            r4 = r9
            r9 = r1
            r3 = r2
            goto L28
        L25:
            r9 = 0
            r3 = r2
            r4 = r3
        L28:
            int r5 = r8.dataPosition()
            java.lang.Object r6 = r7.b     // Catch: java.lang.RuntimeException -> L33
            r8.writeValue(r6)     // Catch: java.lang.RuntimeException -> L33
            r2 = r3
            goto L64
        L33:
            r9 = move-exception
            r8.setDataPosition(r5)
            r8.writeValue(r2)
            java.lang.Object r3 = r7.b
            emuv r4 = new emuv
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Parceling failed for type and will be dropped: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "; "
            r5.append(r3)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            r4.<init>(r9)
            r9 = r1
        L64:
            int r3 = r8.dataPosition()
            r8.writeInt(r9)     // Catch: java.lang.RuntimeException -> L77
            if (r9 == 0) goto L76
            if (r9 == r0) goto L73
            r8.writeValue(r4)     // Catch: java.lang.RuntimeException -> L77
            goto L76
        L73:
            r8.writeValue(r2)     // Catch: java.lang.RuntimeException -> L77
        L76:
            return
        L77:
            r9 = move-exception
            r8.setDataPosition(r3)
            emuv r0 = new emuv
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = "Parceling failed for result and will be dropped: "
            java.lang.String r9 = r2.concat(r9)
            r0.<init>(r9)
            r8.writeInt(r1)
            r8.writeValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emur.writeToParcel(android.os.Parcel, int):void");
    }

    public emur(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        this.b = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.c = erqt.h(new emuv("ParcelableFuture was Parceled before the Future completed."));
        } else if (readInt == 1) {
            this.c = erqt.i(parcel.readValue(classLoader));
        } else {
            if (readInt != 2) {
                throw new IllegalArgumentException(a.h(readInt, "Unknown result type: "));
            }
            this.c = erqt.h((Throwable) parcel.readValue(classLoader));
        }
        a();
    }
}
