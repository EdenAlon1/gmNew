package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesa {
    public boolean a;
    private final Context b;
    private List c;
    private SharedPreferences d;

    public eesa(Context context) {
        this.b = context;
    }

    final List a() {
        b();
        return this.c;
    }

    public final synchronized void b() {
        if (this.d != null) {
            return;
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("exp_sticker_prefs", 0);
        this.d = sharedPreferences;
        String string = sharedPreferences.getString("favorites", "");
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(string);
        this.c = enkr.a(simpleStringSplitter);
        this.a = this.d.getBoolean("show_favorites_prompt", false);
    }

    final void c() {
        b();
        this.d.edit().putString("favorites", TextUtils.join(",", this.c)).apply();
    }

    final void d(boolean z) {
        b();
        if (this.a != z) {
            this.a = z;
            this.d.edit().putBoolean("show_favorites_prompt", this.a).apply();
        }
    }
}
