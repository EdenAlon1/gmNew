package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwj implements dtan {
    public static final enru a = enru.c("com/google/android/libraries/compose/emoji/ui/screen/search/EmojiSearchRenderer");
    public final Context b;
    public final ffsk c;
    public final dqru d;
    public final ffjm e;
    public final ffix f;
    public ffud g;
    public ffud h;
    public String i;
    public final dtal j = new dqwi(this);
    private final dtaj k;
    private final dtaj l;

    public dqwj(Context context, ffsk ffskVar, dtaj dtajVar, dqru dqruVar, ffjm ffjmVar, ffix ffixVar) {
        this.b = context;
        this.c = ffskVar;
        this.k = dtajVar;
        this.d = dqruVar;
        this.e = ffjmVar;
        this.f = ffixVar;
        this.l = dtajVar;
    }

    @Override // defpackage.dtan
    public final int a() {
        return R.string.emoji_search_hint;
    }

    @Override // defpackage.dtan
    public final /* bridge */ /* synthetic */ dtaf b() {
        return null;
    }

    @Override // defpackage.dtan
    public final /* synthetic */ dtak c() {
        return this.l;
    }

    @Override // defpackage.dtan
    public final dtal d() {
        return this.j;
    }

    @Override // defpackage.dtan
    public final /* bridge */ /* synthetic */ ffji e() {
        return null;
    }

    @Override // defpackage.dtan
    public final /* synthetic */ void f() {
        dtam.a(this);
    }
}
