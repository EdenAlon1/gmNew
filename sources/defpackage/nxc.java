package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxc extends oab {
    public nxc() {
        super(false);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str)) {
            return Long.valueOf(bundle.getLong(str, 0L));
        }
        throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        String str2;
        long parseLong;
        str.getClass();
        if (ffpc.n(str, "L")) {
            str2 = str.substring(0, str.length() - 1);
            str2.getClass();
        } else {
            str2 = str;
        }
        if (ffpc.t(str, "0x")) {
            String substring = str2.substring(2);
            substring.getClass();
            parseLong = Long.parseLong(substring, 16);
        } else {
            parseLong = Long.parseLong(str2);
        }
        return Long.valueOf(parseLong);
    }

    @Override // defpackage.oab
    public final String e() {
        return ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG;
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        long longValue = ((Number) obj).longValue();
        str.getClass();
        bundle.putLong(str, longValue);
    }
}
