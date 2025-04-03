package defpackage;

import android.os.Trace;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhy implements rao, duif {
    public final ram b;
    public final rao c;
    public final duig d;
    public final Class e;
    private static final entd f = entd.c("FifeModelLoader");
    public static final qtt a = new qtt("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, new qts() { // from class: duhr
        @Override // defpackage.qts
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            qtt qttVar = duhy.a;
            if (((Boolean) obj).booleanValue()) {
                messageDigest.update(bArr);
            }
        }
    });

    public duhy(rao raoVar, duig duigVar, ram ramVar, Class cls) {
        new erpq();
        this.c = raoVar;
        this.d = duigVar;
        this.e = cls;
        if (duigVar != null) {
            ((egah) duigVar).c = this;
        }
        this.b = ramVar == null ? new ram(2000L) : ramVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public final qzz c(duhq duhqVar, int i, int i2, boolean z, rab rabVar) {
        ozg.a("FifeModelLoader.buildGlideUrl");
        int i3 = 0;
        boolean z2 = z && rabVar == null;
        if (z2) {
            try {
                qzz qzzVar = (qzz) this.b.a(duhqVar, i, i2);
                if (qzzVar != null) {
                    return qzzVar;
                }
            } finally {
                Trace.endSection();
            }
        }
        duie duieVar = duhqVar.b;
        String str = duhqVar.c.b;
        int i4 = duieVar.b;
        int b = duieVar.b(i);
        int b2 = duieVar.b(i2);
        int i5 = duieVar.c;
        int i6 = duieVar.d;
        int i7 = duieVar.e;
        int i8 = eera.a;
        int i9 = eeqy.a;
        String b3 = eera.b(str, i4, b, b2);
        if (b3 != null) {
            str = b3;
        } else {
            if (b != 0) {
                i3 = b;
            } else if (b2 != 0) {
            }
            str = eerb.a(i3, b2, str);
        }
        if (rabVar == null) {
            duig duigVar = this.d;
            rabVar = duigVar == null ? rab.b : duigVar.a(duhqVar);
        }
        qzz qzzVar2 = new qzz(str, rabVar);
        if (z2) {
            this.b.b(duhqVar, i, i2, qzzVar2);
        }
        return qzzVar2;
    }

    @Override // defpackage.rao
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ran a(final duhq duhqVar, final int i, final int i2, qtu qtuVar) {
        ran ranVar;
        ozg.a("FifeModelLoader.beginSection");
        try {
            ((ensz) f.o().h("com/google/android/libraries/glide/fife/FifeModelLoader", "buildLoadData", 132, "FifeModelLoader.java")).J("Loading fife model, model: %s, width: %d, height: %d", duhqVar, Integer.valueOf(i), Integer.valueOf(i2));
            try {
                if (this.d == null) {
                    ranVar = this.c.a(c(duhqVar, i, i2, true, null), i, i2, qtuVar);
                } else {
                    List list = Collections.EMPTY_LIST;
                    if (((Boolean) qtuVar.b(a)).booleanValue()) {
                        list = Collections.singletonList(new duid(duhqVar, i, i2, new duic() { // from class: duhs
                            @Override // defpackage.duic
                            public final qzz a() {
                                return duhy.this.c(duhqVar, i, i2, false, null);
                            }
                        }));
                    }
                    ranVar = new ran(new duid(duhqVar, i, i2, new duic() { // from class: duht
                        @Override // defpackage.duic
                        public final qzz a() {
                            return duhy.this.c(duhqVar, i, i2, true, null);
                        }
                    }), list, new duhv(this, duhqVar, i, i2, qtuVar));
                }
                Trace.endSection();
                return ranVar;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public duhy(rao raoVar, Class cls) {
        this(raoVar, null, null, cls);
    }
}
