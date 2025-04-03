package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuv extends deva {
    final /* synthetic */ Long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deuv(devc devcVar, String str, Long l) {
        super(devcVar, str);
        this.a = l;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Long.valueOf(sharedPreferences.getLong(this.c, 0L)) : this.a;
    }

    @Override // defpackage.deva
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            throw new IllegalArgumentException("null cannot be written for Long");
        }
        editor.putLong(this.c, l.longValue());
    }
}
