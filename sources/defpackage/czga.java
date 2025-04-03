package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czga extends czgd {
    public static final eptv a;
    public final alcb b;
    public int c;
    private final alct d;
    private final cqoh e;

    static {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        epts eptsVar = epts.EMOJI;
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = eptsVar.v;
        eptvVar.b |= 1;
        eptu eptuVar = eptu.EXPANDED;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        a = (eptv) eptqVar.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public czga(defpackage.czgx r8, defpackage.czgy r9, defpackage.czha r10, defpackage.fr r11, defpackage.alct r12, defpackage.alcb r13, defpackage.cqoh r14, android.content.Context r15) {
        /*
            r7 = this;
            defpackage.czgn.b()
            czdq r0 = defpackage.czgn.a(r11)
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r0.aK()
            if (r0 == 0) goto L11
            r1 = 1
        L11:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r15
            r6 = r1
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r12
            r7.b = r13
            r7.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czga.<init>(czgx, czgy, czha, fr, alct, alcb, cqoh, android.content.Context):void");
    }

    @Override // defpackage.czgz
    public final boolean s(boolean z) {
        cqoh cqohVar = this.e;
        eptk eptkVar = eptk.BACK_BUTTON;
        eptv eptvVar = a;
        cqohVar.f().toEpochMilli();
        this.d.c(eptvVar, eptkVar);
        this.c = 0;
        czgn.b();
        fr frVar = this.v;
        csix.l(frVar);
        czdq a2 = czgn.a(frVar);
        if (a2 == null) {
            return true;
        }
        cg cgVar = new cg(frVar);
        if (z) {
            cgVar.F(R.animator.emoji_slide_in_up, R.animator.emoji_slide_out_down);
            cgVar.E(R.id.emoji_gallery_container_for_c2o, new czgm());
        } else {
            cgVar.l(a2);
            a2.b();
        }
        try {
            cgVar.j();
            return true;
        } catch (IllegalStateException e) {
            csjy.h("Bugle", e, "hideEmojiGallery cannot commit fragment");
            return true;
        }
    }

    @Override // defpackage.czgz
    public final void v(boolean z) {
        this.e.f().toEpochMilli();
        czfz czfzVar = new czfz(this);
        czgn.b();
        csix.l(this.r);
        fr frVar = this.v;
        csix.l(frVar);
        csix.l(czfzVar);
        cg cgVar = new cg(frVar);
        if (z) {
            cgVar.F(R.animator.emoji_slide_in_up, R.animator.emoji_slide_out_down);
        }
        czdq a2 = czgn.a(frVar);
        if (a2 == null) {
            a2 = new czdz();
            cgVar.x(R.id.emoji_gallery_container_for_c2o, a2, "emojiGallery");
        } else {
            cgVar.q(a2);
        }
        a2.f(czfzVar);
        try {
            cgVar.j();
        } catch (IllegalStateException e) {
            csjy.h("Bugle", e, "showEmojiGallery cannot commit fragment");
        }
    }
}
