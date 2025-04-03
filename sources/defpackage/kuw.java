package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kuw extends kva {
    public kuw(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.kva
    public final /* synthetic */ Object a(View view) {
        return kvh.a(view);
    }

    @Override // defpackage.kva
    public final /* synthetic */ void b(View view, Object obj) {
        kvh.d(view, (CharSequence) obj);
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
