package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehut implements ehur {
    private final ehvg a;
    private final ehup b;
    private final Context c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public ehut(ehvg ehvgVar, ehup ehupVar, Context context) {
        this.a = ehvgVar;
        this.b = ehupVar;
        this.c = context;
    }

    @Override // defpackage.ehur
    public final dhre a() {
        String packageName = this.c.getPackageName();
        ehvg ehvgVar = this.a;
        if (ehvgVar.b == null) {
            return ehvg.c();
        }
        ehvg.a.d("requestUpdateInfo(%s)", packageName);
        dhri dhriVar = new dhri();
        ehvgVar.b.b(new ehvb(ehvgVar, dhriVar, packageName, dhriVar), dhriVar);
        return dhriVar.a;
    }

    @Override // defpackage.ehur
    public final dhre b(ehun ehunVar, Activity activity, ehuz ehuzVar) {
        if (ehunVar.f) {
            return dhrt.b(new ehvo(-4));
        }
        if (ehunVar.a(ehuzVar) == null) {
            return dhrt.b(new ehvo(-6));
        }
        ehunVar.f = true;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", ehunVar.a(ehuzVar));
        dhri dhriVar = new dhri();
        intent.putExtra("result_receiver", new ehus(this.d, dhriVar));
        activity.startActivity(intent);
        return dhriVar.a;
    }

    @Override // defpackage.ehur
    public final synchronized void c(aeux aeuxVar) {
        this.b.c(aeuxVar);
    }

    @Override // defpackage.ehur
    public final synchronized void d(aeux aeuxVar) {
        this.b.d(aeuxVar);
    }

    @Override // defpackage.ehur
    public final void e() {
        String packageName = this.c.getPackageName();
        ehvg ehvgVar = this.a;
        if (ehvgVar.b == null) {
            ehvg.c();
            return;
        }
        ehvg.a.d("completeUpdate(%s)", packageName);
        dhri dhriVar = new dhri();
        ehvgVar.b.b(new ehvc(ehvgVar, dhriVar, dhriVar, packageName), dhriVar);
    }
}
