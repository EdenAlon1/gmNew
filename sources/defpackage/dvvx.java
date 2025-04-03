package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvx {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final erho c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        erhn erhnVar = (erhn) erho.a.createBuilder();
        erhnVar.copyOnWrite();
        erho.b((erho) erhnVar.instance);
        erhnVar.copyOnWrite();
        erho.a((erho) erhnVar.instance);
        erhnVar.copyOnWrite();
        erho erhoVar = (erho) erhnVar.instance;
        erhoVar.b |= 1;
        erhoVar.c = currentTimeMillis;
        c = (erho) erhnVar.build();
    }

    public static erhm a() {
        erhl erhlVar = (erhl) erhm.a.createBuilder();
        long andIncrement = a.getAndIncrement();
        erhlVar.copyOnWrite();
        erhm erhmVar = (erhm) erhlVar.instance;
        erhmVar.b |= 2;
        erhmVar.d = andIncrement;
        erho erhoVar = c;
        erhlVar.copyOnWrite();
        erhm erhmVar2 = (erhm) erhlVar.instance;
        erhoVar.getClass();
        erhmVar2.c = erhoVar;
        erhmVar2.b |= 1;
        return (erhm) erhlVar.build();
    }
}
