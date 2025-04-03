package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dezf {
    public static evup a() {
        UUID randomUUID = UUID.randomUUID();
        evuo evuoVar = (evuo) evup.a.createBuilder();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        evuoVar.copyOnWrite();
        evup evupVar = (evup) evuoVar.instance;
        evupVar.b |= 1;
        evupVar.c = mostSignificantBits;
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        evuoVar.copyOnWrite();
        evup evupVar2 = (evup) evuoVar.instance;
        evupVar2.b |= 2;
        evupVar2.d = leastSignificantBits;
        return (evup) evuoVar.build();
    }
}
