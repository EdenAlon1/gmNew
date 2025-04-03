package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbv extends dcar implements czew {
    private final dcbs c;
    private final dcab d;
    private final czes e;
    private final czex f;
    private dcbq g;
    private final dcbr m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcbv(android.content.Context r14, defpackage.cuxz r15, defpackage.dcbt r16, defpackage.czdp r17, defpackage.czes r18, defpackage.czex r19, defpackage.dcbc r20) {
        /*
            r13 = this;
            r0 = r16
            r1 = r19
            eymn r2 = defpackage.eymn.EMOJI
            r3 = r20
            dcav r3 = (defpackage.dcav) r3
            int r4 = r3.h
            r13.<init>(r15, r2, r4)
            r13.f = r1
            dcbr r9 = new dcbr
            r15 = r17
            r9.<init>(r14, r1, r15)
            r13.m = r9
            czgx r14 = r3.c
            if (r14 == 0) goto L59
            dcbu r10 = new dcbu
            r10.<init>()
            r13.d = r10
            com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView r11 = r3.i
            int r12 = r3.h
            dcbs r5 = new dcbs
            ffbr r14 = r0.a
            java.lang.Object r14 = r14.b()
            r6 = r14
            alcb r6 = (defpackage.alcb) r6
            r6.getClass()
            ffbr r14 = r0.b
            java.lang.Object r14 = r14.b()
            r7 = r14
            czes r7 = (defpackage.czes) r7
            r7.getClass()
            ffbr r14 = r0.c
            java.lang.Object r14 = r14.b()
            r8 = r14
            czdp r8 = (defpackage.czdp) r8
            r8.getClass()
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.c = r5
            r14 = r18
            r13.e = r14
            return
        L59:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "ConversationInputBase cannot be null!"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcbv.<init>(android.content.Context, cuxz, dcbt, czdp, czes, czex, dcbc):void");
    }

    @Override // defpackage.dcar
    protected final dbzy A() {
        return this.c;
    }

    @Override // defpackage.czew
    public final void J(czex czexVar) {
        dcbr dcbrVar = this.m;
        if (dcbrVar.d) {
            dcbrVar.b(czexVar.a);
            z().p();
        }
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.emoji_content_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_emoji_content_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return R.drawable.ic_insert_emoticon_white;
    }

    @Override // defpackage.dcae
    public final void g(Bundle bundle) {
        this.e.d();
        this.f.a(this);
        this.m.b(this.f.a);
    }

    @Override // defpackage.dcae
    public final void h() {
        this.f.c(this);
        this.e.e();
    }

    @Override // defpackage.dcat
    public final void j() {
        this.d.e(eptm.CATEGORY_HEADER);
    }

    @Override // defpackage.dcar
    protected final int k() {
        return R.string.c2o_category_name_emojis;
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dcae
    public final void v(dbzn dbznVar) {
        this.i = dbznVar;
        this.c.a = this.i;
    }

    @Override // defpackage.dcae
    public final void w(int i) {
        this.l = i;
        this.c.c = i;
    }

    @Override // defpackage.dcar
    protected final dbzx z() {
        if (this.g == null) {
            this.g = new dcbq(this.c);
        }
        return this.g;
    }
}
