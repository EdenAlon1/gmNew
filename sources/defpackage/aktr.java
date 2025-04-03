package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aktr implements cnjs, cnjx {
    private final ffbr a;
    private final ffbr b;

    public aktr(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.cnjs
    public final void a() {
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            coja cojaVar = (coja) this.b.b();
            String[] strArr = ScheduledSendTable.a;
            coit coitVar = new coit();
            coitVar.d(coiu.SENDING);
            cojaVar.j(new cois(coitVar), coiu.SCHEDULED).k(axnw.b(), (Executor) this.a.b());
        }
    }

    @Override // defpackage.cnjx
    public final void b() {
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            ((coja) this.b.b()).i().k(axnw.b(), (Executor) this.a.b());
        }
    }
}
