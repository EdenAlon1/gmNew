package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvk implements ahvh {
    public final ffbr a;
    public final ffbr b;
    public final fgcm c;
    public final dotb d;
    public final ahvw e;
    private final Context f;
    private final ffsk g;
    private final ahvn h;
    private final aicu i;

    public ahvk(Context context, ffsk ffskVar, aicu aicuVar, ahvw ahvwVar, ffbr ffbrVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        aicuVar.getClass();
        ahvwVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.f = context;
        this.g = ffskVar;
        this.i = aicuVar;
        this.e = ahvwVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = fgdm.a(false);
        String string = context.getString(R.string.multi_share_edit_message_top_app_bar_title);
        string.getClass();
        dosk doskVar = new dosk(string, null, null, false, null, null, null, 254);
        String string2 = context.getString(R.string.action_back);
        string2.getClass();
        dotb dotbVar = new dotb(doskVar, new dlsr(string2, dmzz.p, false, false, false, false, null, false, null, new ffix() { // from class: ahvi
            @Override // defpackage.ffix
            public final Object invoke() {
                ahvk ahvkVar = ahvk.this;
                aifv.d((aifv) ahvkVar.a.b(), 12, 0, 0, 6);
                ahvkVar.c.f(false);
                return ffcu.a;
            }
        }, 1020), null, false, false, null, null, 116);
        this.d = dotbVar;
        this.h = new ahvn(false, ffel.a, ahvwVar.a(), dotbVar, new ahvm(((auhn) ffbrVar2.b()).a()));
    }

    @Override // defpackage.ahvh
    public final fgdj a() {
        fgch fgchVar = new fgch(this.c, this.i.a, new ahvj(this, null));
        int i = fgcz.a;
        return fgbn.b(fgchVar, this.g, fgcy.a(0L, 3), this.h);
    }

    @Override // defpackage.ahvh
    public final void b() {
        this.c.f(true);
    }
}
