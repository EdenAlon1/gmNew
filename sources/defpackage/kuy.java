package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kuy extends kva {
    public kuy(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(kvh.f(view));
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        kvh.c(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
