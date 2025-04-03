package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import defpackage.cex;
import defpackage.cfj;
import defpackage.lkj;
import defpackage.lkk;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ cex this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ lkk val$lifecycle;
    final /* synthetic */ cfj val$listener;

    CarContext$1(cex cexVar, lkk lkkVar, Executor executor, cfj cfjVar) {
        this.this$0 = cexVar;
        this.val$lifecycle = lkkVar;
        this.val$executor = executor;
        this.val$listener = cfjVar;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.a().a(lkj.CREATED)) {
            final List asList = Arrays.asList(strArr);
            final List asList2 = Arrays.asList(strArr2);
            Executor executor = this.val$executor;
            final cfj cfjVar = this.val$listener;
            executor.execute(new Runnable() { // from class: cev
                @Override // java.lang.Runnable
                public final void run() {
                    cfj cfjVar2 = cfj.this;
                    List list = asList;
                    List list2 = asList2;
                    cfjVar2.a();
                }
            });
        }
    }
}
