package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvyc {
    public final dvzc a;
    public final dvxy b;

    public dvyc(dvzc dvzcVar) {
        this.a = dvzcVar;
        this.b = new dvxy(dvzcVar);
    }

    public final dvwz a(int i) {
        return new dvwz(dvxd.a(i), new emwl() { // from class: dvxz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new UnsupportedOperationException("Do not call attach()");
            }
        }, this.a, null);
    }

    @Deprecated
    public final dvwz b(final View view, int i) {
        return new dvwz(dvxd.a(i), new emwl() { // from class: dvya
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                View view2 = view;
                dvxe dvxeVar = (dvxe) obj;
                dvxe c = dvxv.c(view2);
                if (c == null) {
                    dvxv.s(view2, dvxeVar);
                    return dvxeVar;
                }
                if (!c.e()) {
                    c.d(dvxeVar);
                    return c;
                }
                dvyc dvycVar = dvyc.this;
                if (c.f()) {
                    dvycVar.a.d(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                    return c;
                }
                dvycVar.a.d(new IllegalStateException("CVE is already attached and cannot be replaced."));
                return c;
            }
        }, this.a, null);
    }
}
