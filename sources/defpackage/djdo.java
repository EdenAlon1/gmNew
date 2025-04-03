package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdo extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djdo(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djdo.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        djeb djebVar = (djeb) list.get(0);
        boolean z = true;
        Optional optional = (Optional) list.get(1);
        dipa dipaVar = (dipa) list.get(3);
        Context context = (Context) list.get(4);
        diyy diyyVar = djdd.a;
        if (!djebVar.b().isEmpty() && !djebVar.a().isPresent()) {
            if (!((Boolean) djdd.a.a()).booleanValue()) {
                z = dipaVar.l((String) optional.orElse(null));
            } else if (!optional.isEmpty()) {
                dkom dkomVar = new dkom();
                dkomVar.a = 30015;
                dkomVar.b = (String) optional.get();
                ImsEvent a = dkomVar.a();
                Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                intent.putExtra(RcsIntents.EXTRA_EVENT, a);
                dkuk.a(context, intent, dkuj.RECEIVE_MESSAGE_PRODUCER_MODULE2);
            }
        }
        return erqt.i(Boolean.valueOf(z));
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
