package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufy {
    public static dubz a(emwl emwlVar, String str) {
        dubz dubzVar = (dubz) emwlVar.apply(str);
        if (dubzVar != null) {
            return dubzVar;
        }
        throw new IllegalArgumentException("GellerConfig is null");
    }

    public static String b(emxc emxcVar) {
        return emxcVar.g() ? ((Account) emxcVar.c()).name : "";
    }

    public static boolean c(String str, ezib ezibVar, Geller geller) {
        if (GellerDatabase.b.contains(ezibVar.name())) {
            return true;
        }
        Map b = geller.c.b(str).b();
        emxc j = b.containsKey(ezibVar.name()) ? emxc.j((ezic) b.get(ezibVar.name())) : emux.a;
        if (j.g()) {
            return ((ezic) j.c()).equals(ezic.CUSTOM_STORAGE_TYPE_GDD);
        }
        return false;
    }
}
