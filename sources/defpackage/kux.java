package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kux extends kva {
    public kux(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.kva
    public final /* synthetic */ Object a(View view) {
        return kvj.c(view);
    }

    @Override // defpackage.kva
    public final /* synthetic */ void b(View view, Object obj) {
        kvj.d(view, (CharSequence) obj);
    }

    @Override // defpackage.kva
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
