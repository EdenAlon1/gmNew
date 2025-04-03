package defpackage;

import android.provider.MediaStore;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bduy implements ljv {
    private static final cfup e = cfvl.f(cfvl.b, "p2p_share_recent_image_age_limit_millis", TimeUnit.MINUTES.toMillis(1));
    public final bdva b;
    public long d;
    private final cqoh f;
    private final ctud g;
    private final ctml h;
    private final ejtr i;
    private final ejte j;
    public final Set a = new HashSet();
    private boolean k = false;
    public ConversationIdType c = bdgq.a;

    public bduy(ejtr ejtrVar, cqoh cqohVar, ctud ctudVar, ctml ctmlVar, bdva bdvaVar, elbx elbxVar) {
        this.i = ejtrVar;
        this.b = bdvaVar;
        this.j = new bdux(this, elbxVar);
        this.f = cqohVar;
        this.g = ctudVar;
        this.h = ctmlVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        if (this.h.i() && this.g.s() && !this.c.b()) {
            long epochMilli = this.f.f().toEpochMilli() - ((Long) e.e()).longValue();
            this.d = epochMilli;
            if (this.k) {
                return;
            }
            this.b.a(this.c, null, epochMilli, this.a);
            this.k = true;
            this.i.d(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.j);
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        if (this.k) {
            this.k = false;
            this.i.e(this.j);
            this.c = bdgq.a;
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
