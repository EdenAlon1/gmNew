package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adud implements adtw {
    private final alit a;
    private final Context b;

    public adud(alit alitVar, Context context) {
        this.a = alitVar;
        this.b = context;
    }

    @Override // defpackage.adtw
    public final elfl a() {
        return elfo.e(new HashMap());
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        final alit alitVar = this.a;
        return elfo.g(new Callable() { // from class: alis
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                if (((Boolean) cful.ah.e()).booleanValue()) {
                    alit alitVar2 = alit.this;
                    byte[] b = alitVar2.b();
                    if (b != null) {
                        arrayList.add(new FileTeleporter(b, "Message status log"));
                    }
                    byte[] a = alitVar2.a();
                    if (a != null) {
                        arrayList.add(new FileTeleporter(a, "App event log"));
                    }
                }
                return arrayList;
            }
        }, alitVar.a);
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }

    @Override // defpackage.adtw
    public final eoih e() {
        return eoih.BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_MESSAGES_STATUS_HISTORY;
    }

    @Override // defpackage.adtw
    public final String f() {
        return this.b.getString(R.string.messages_status_feedback_data_description);
    }

    @Override // defpackage.adtw
    public final String g() {
        return this.b.getString(R.string.messages_status_feedback_data_detail_title);
    }

    @Override // defpackage.adtw
    public final String h() {
        return this.b.getString(R.string.messages_status_feedback_data_name);
    }

    @Override // defpackage.adtw
    public final String i() {
        return this.b.getString(R.string.messages_status_feedback_data_rationale);
    }

    @Override // defpackage.adtw
    public final String j() {
        return this.b.getString(R.string.messages_status_feedback_data_rationale_title);
    }
}
