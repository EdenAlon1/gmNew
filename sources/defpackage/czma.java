package defpackage;

import android.widget.ImageView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czma implements rif {
    final /* synthetic */ ffix a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ czmi d;
    final /* synthetic */ czmb e;

    public czma(ffix ffixVar, ImageView imageView, CharSequence charSequence, czmi czmiVar, czmb czmbVar) {
        this.a = ffixVar;
        this.b = imageView;
        this.c = charSequence;
        this.d = czmiVar;
        this.e = czmbVar;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        this.a.invoke();
        return true;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        this.b.setTag(R.id.message_animated_emoji_view, this.c);
        czmi czmiVar = this.d;
        if (czmiVar == czmi.b) {
            ((czmh) this.e.a.b()).a();
            return false;
        }
        if (czmiVar != czmi.c) {
            return false;
        }
        ((czmh) this.e.a.b()).b();
        return false;
    }
}
