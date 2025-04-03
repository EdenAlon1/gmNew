package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doft {
    public static final void a(final dofr dofrVar, final boolean z, hfd hfdVar, final int i, final int i2) {
        int i3;
        hfd b = hfdVar.b(1599544550);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dofrVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        boolean z2 = i4 == 0;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            boolean z3 = z2 & z;
            if (dofrVar instanceof dofq) {
                b.v(-66947911);
                throw null;
            }
            if (dofrVar instanceof dofp) {
                b.v(-66668446);
                dofp dofpVar = (dofp) dofrVar;
                dofy dofyVar = dofpVar.c;
                b.v(-971981080);
                if (dofyVar != null) {
                    doge.a(dofyVar, b, 0);
                    ebv.a(ebs.o(hvi.e, 12.0f), b);
                }
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                dogc.b(dofpVar.a, dofpVar.b, z3, b, (i3 << 3) & 896, 0);
                z = z3;
                hfmVar.Z();
            } else {
                z = z3;
                if (!ffkj.e(dofrVar, dofo.a)) {
                    b.v(-971992165);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-971971926);
                dogc.b(null, jii.a(R.string.reply_snippet_deleted_message_text, b), false, b, 6, 4);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dofs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dofr dofrVar2 = dofr.this;
                    int i5 = i;
                    doft.a(dofrVar2, z, (hfd) obj, hip.a(i5 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
