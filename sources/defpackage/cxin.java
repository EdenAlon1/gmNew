package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SwipeActionPreference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxin {
    public final cxij a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public Optional e = Optional.empty();
    public cxhw f;

    public cxin(cxij cxijVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = cxijVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public final void a(final int i, final int i2, int i3, int i4, int i5, int i6, int i7) {
        cxij cxijVar = this.a;
        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) cxijVar.a(cxijVar.Y(i));
        swipeActionPreference.getClass();
        if (swipeActionPreference.U()) {
            cxhv cxhvVar = cxhv.ARCHIVE;
            swipeActionPreference.a = i2;
            swipeActionPreference.b = i3;
            swipeActionPreference.c = i4;
            swipeActionPreference.d = i5;
            swipeActionPreference.e = i6;
            swipeActionPreference.f = i7;
            swipeActionPreference.k(cxhvVar);
            swipeActionPreference.o = new oni() { // from class: cxil
                /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                
                    if (r0 != null) goto L16;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[EDGE_INSN: B:24:0x0084->B:18:0x0084 BREAK  A[LOOP:0: B:11:0x0077->B:15:0x0081], SYNTHETIC] */
                @Override // defpackage.oni
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean a(androidx.preference.Preference r9) {
                    /*
                        r8 = this;
                        cxin r9 = defpackage.cxin.this
                        j$.util.Optional r0 = r9.e
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L99
                        int r0 = r3
                        int r6 = r2
                        ffbr r1 = r9.b
                        java.lang.Object r1 = r1.b()
                        cxii r1 = (defpackage.cxii) r1
                        cxij r2 = r9.a
                        ffbr r3 = r1.a
                        java.lang.String r7 = r2.Y(r0)
                        r0 = r1
                        cxih r1 = new cxih
                        java.lang.Object r2 = r3.b()
                        android.content.Context r2 = (android.content.Context) r2
                        r2.getClass()
                        ffbr r3 = r0.b
                        java.lang.Object r3 = r3.b()
                        cxig r3 = (defpackage.cxig) r3
                        ffbr r4 = r0.c
                        java.lang.Object r4 = r4.b()
                        elbx r4 = (defpackage.elbx) r4
                        r4.getClass()
                        ffbr r0 = r0.d
                        java.lang.Object r0 = r0.b()
                        r5 = r0
                        akzt r5 = (defpackage.akzt) r5
                        r5.getClass()
                        r7.getClass()
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        cxhw r0 = r9.f
                        if (r0 == 0) goto L70
                        r2 = 2132087954(0x7f151492, float:1.9816178E38)
                        if (r6 != r2) goto L63
                        int r0 = r0.c
                        cxhv r0 = defpackage.cxhv.b(r0)
                        if (r0 != 0) goto L72
                        cxhv r0 = defpackage.cxhv.ARCHIVE
                        goto L72
                    L63:
                        r2 = 2132087956(0x7f151494, float:1.9816182E38)
                        if (r6 != r2) goto L70
                        int r0 = r0.d
                        cxhv r0 = defpackage.cxhv.b(r0)
                        if (r0 != 0) goto L72
                    L70:
                        cxhv r0 = defpackage.cxhv.ARCHIVE
                    L72:
                        cxhv[] r2 = defpackage.cxig.d()
                        r3 = 0
                    L77:
                        r4 = 4
                        if (r3 >= r4) goto L84
                        r4 = r2[r3]
                        if (r0 != r4) goto L81
                        r1.l = r3
                        goto L84
                    L81:
                        int r3 = r3 + 1
                        goto L77
                    L84:
                        r1.c()
                        j$.util.Optional r0 = j$.util.Optional.of(r1)
                        r9.e = r0
                        iv r0 = r1.n
                        if (r0 == 0) goto L99
                        cxim r1 = new cxim
                        r1.<init>()
                        r0.setOnDismissListener(r1)
                    L99:
                        r9 = 1
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cxil.a(androidx.preference.Preference):boolean");
                }
            };
        }
    }
}
