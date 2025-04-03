package defpackage;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evnt {
    final String g;
    public final Field h;
    final String i;

    protected evnt(String str, Field field) {
        this.g = str;
        this.h = field;
        this.i = field.getName();
    }

    public abstract void a(evpl evplVar, int i, Object[] objArr);

    public abstract void b(evpl evplVar, Object obj);

    public abstract void c(evpn evpnVar, Object obj);
}
