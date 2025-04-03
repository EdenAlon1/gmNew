package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdb extends ffkk implements ffji {
    final /* synthetic */ Locale a;
    final /* synthetic */ dmug b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdb(dmug dmugVar, Locale locale) {
        super(1);
        this.b = dmugVar;
        this.a = locale;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        Long l = (Long) list.get(0);
        Long l2 = (Long) list.get(1);
        Object obj2 = list.get(2);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(3);
        obj3.getClass();
        ffmj ffmjVar = new ffmj(intValue, ((Integer) obj3).intValue());
        Object obj4 = list.get(4);
        obj4.getClass();
        return new gdc(l, l2, ffmjVar, ((Integer) obj4).intValue(), this.b, this.a);
    }
}
