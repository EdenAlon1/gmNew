package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbez implements bbcb {
    private final bbey a;

    public bbez(bbey bbeyVar) {
        this.a = bbeyVar;
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        List list = (List) obj2;
        if (list == null) {
            this.a.a();
        } else {
            this.a.b(list);
        }
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        this.a.a();
    }
}
