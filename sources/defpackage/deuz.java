package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuz extends devb {
    final /* synthetic */ enip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deuz(devc devcVar, enip enipVar) {
        super(devcVar);
        this.a = enipVar;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.c, this.a);
        if (stringSet != null) {
            return enip.o(stringSet);
        }
        return null;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Set<String> set = (Set) obj;
        if (set == null) {
            throw new IllegalArgumentException("null cannot be written for Set<String>");
        }
        editor.putStringSet(this.c, set);
    }
}
