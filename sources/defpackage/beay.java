package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beay implements bbcb {
    final /* synthetic */ CountDownLatch a;

    public beay(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        this.a.countDown();
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        this.a.countDown();
    }
}
