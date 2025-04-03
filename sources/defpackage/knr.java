package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knr {
    public final CharSequence a;
    public final IconCompat b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public knr(knq knqVar) {
        this.a = knqVar.a;
        this.b = knqVar.b;
        this.c = knqVar.c;
        this.d = knqVar.d;
        this.e = knqVar.e;
        this.f = knqVar.f;
    }

    public static knr b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        knq knqVar = new knq();
        knqVar.a = bundle.getCharSequence("name");
        knqVar.b = bundle2 != null ? IconCompat.f(bundle2) : null;
        knqVar.c = bundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        knqVar.d = bundle.getString("key");
        knqVar.e = bundle.getBoolean("isBot");
        knqVar.f = bundle.getBoolean("isImportant");
        return new knr(knqVar);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.e() : null);
        bundle.putString(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof knr)) {
            return false;
        }
        knr knrVar = (knr) obj;
        String str = this.d;
        String str2 = knrVar.d;
        if (str != null || str2 != null) {
            return Objects.equals(str, str2);
        }
        if (Objects.equals(Objects.toString(this.a), Objects.toString(knrVar.a)) && Objects.equals(this.c, knrVar.c)) {
            if (Objects.equals(Boolean.valueOf(this.e), Boolean.valueOf(knrVar.e))) {
                if (Objects.equals(Boolean.valueOf(this.f), Boolean.valueOf(knrVar.f))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
