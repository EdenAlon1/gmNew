package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbbh implements cbbn {
    protected final Context a;
    protected final cbbi b;
    public final cqoh c;
    public final ctap d;
    protected int e;
    public int f = 0;
    private final ffbr g;

    /* compiled from: PG */
    public interface a {
        ctap cO();

        ffbr gr();

        cqoh v();
    }

    public cbbh(Context context, cbbi cbbiVar) {
        this.a = context;
        this.b = cbbiVar;
        a aVar = (a) ekhw.a(context, a.class);
        this.c = aVar.v();
        this.d = aVar.cO();
        this.g = aVar.gr();
    }

    @Override // defpackage.cbbn
    public final int a() {
        return this.f;
    }

    @Override // defpackage.cbbn
    public final int b() {
        return 3;
    }

    @Override // defpackage.cbbn
    public final cbbl c() {
        return ((cbbm) this.g.b()).c(j());
    }

    @Override // defpackage.cbbn
    public final /* synthetic */ cbbo d() {
        return this.b;
    }

    @Override // defpackage.cbbn
    public final /* bridge */ /* synthetic */ cbcc e(List list) {
        csix.h();
        cbbk h = h(list);
        if (h == null) {
            throw new IllegalStateException("Error reading from resources.");
        }
        cbbi cbbiVar = this.b;
        int i = cbbiVar.i;
        boolean z = cbbiVar.h;
        if ((!z && i == 0) || !(h instanceof cbaw)) {
            return h;
        }
        int i2 = cbbiVar.b;
        int i3 = cbbiVar.c;
        Bitmap d = h.d();
        Bitmap a2 = m().a(i2, i3);
        ctap.s(d, new Canvas(a2), new RectF(0.0f, 0.0f, d.getWidth(), d.getHeight()), new RectF(0.0f, 0.0f, i2, i3), i != 0, i, z);
        return new cbaw(f(), a2, h.c(), this.c, this.d);
    }

    @Override // defpackage.cbbn
    public final String f() {
        return this.b.g();
    }

    protected cbbk h(List list) {
        cbbk cbawVar;
        ekzz f = eleg.f("ImageRequest.loadMediaInternal");
        try {
            if (this.b.g || !o()) {
                Bitmap l = l();
                if (l == null) {
                    throw new RuntimeException("failed decoding bitmap");
                }
                cbawVar = new cbaw(f(), l, this.e, this.c, this.d);
            } else {
                InputStream i = i();
                if (i == null) {
                    cbawVar = null;
                } else {
                    try {
                        if (this.b.j) {
                            cbawVar = new cbbb(f(), dfyt.b(i), this.c);
                        } else {
                            cbawVar = cbbg.m(f(), i, this.c);
                            if (cbawVar == null) {
                                throw new IllegalStateException("Error decoding gif");
                            }
                        }
                        i.close();
                    } finally {
                    }
                }
            }
            f.close();
            return cbawVar;
        } finally {
        }
    }

    protected abstract InputStream i();

    public int j() {
        return 1;
    }

    protected Bitmap k() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.Bitmap l() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbbh.l():android.graphics.Bitmap");
    }

    protected final cbcb m() {
        cbbm cbbmVar = (cbbm) this.g.b();
        int j = j();
        cbbl c = cbbmVar.c(j);
        if (c instanceof cbca) {
            return ((cbca) c).d;
        }
        throw new IllegalArgumentException(defpackage.a.h(j, "MediaCacheManager: cache id does not correspond to a PoolableImageCache "));
    }

    protected boolean n() {
        return false;
    }

    protected boolean o() {
        return ctap.m(i());
    }
}
