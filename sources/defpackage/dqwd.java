package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwd implements duqz {
    public final dqra a;
    private final Context b;
    private final ffsk c;

    public dqwd(Context context, ffsk ffskVar, dqra dqraVar) {
        context.getClass();
        ffskVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.a = dqraVar;
    }

    @Override // defpackage.duqz
    public final ListenableFuture a() {
        ListenableFuture b;
        b = fgfz.b(this.c, ffhe.a, ffsm.a, new dqwc(this, null));
        return b;
    }

    @Override // defpackage.dura
    public final /* synthetic */ ListenableFuture b() {
        return duqy.a(this);
    }

    @Override // defpackage.dura
    public final String c() {
        String string = this.b.getResources().getString(R.string.emoji_recents_category);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    @Override // defpackage.dura
    public final /* synthetic */ void d(duvw duvwVar) {
        duqy.b(this, duvwVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.duqz
    public final void e(String str) {
    }
}
