package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuv extends kva {
    public kuv(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(kvh.g(view));
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        kvh.e(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}
