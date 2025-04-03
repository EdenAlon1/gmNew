package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahqm implements ffxy {
    final /* synthetic */ ConstraintLayout a;

    public ahqm(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        float floatValue = ((Number) obj).floatValue();
        kkk kkkVar = new kkk();
        ConstraintLayout constraintLayout = this.a;
        kkkVar.d(constraintLayout);
        kkkVar.h(R.id.conversation_list_root_container, floatValue);
        kkkVar.h(R.id.conversation_container_background, 1.0f - floatValue);
        kkkVar.c(constraintLayout);
        return ffcu.a;
    }
}
