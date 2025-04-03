package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzcu {
    public static fcfn a(Context context, UUID uuid) {
        dyjo a = dyjo.a(context);
        fcef fcefVar = (fcef) fceg.a.createBuilder();
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).e = 4;
        int i = a.a;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).b = i;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).c = 0;
        int i2 = a.b;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).d = i2;
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).g = fgti.a(3);
        fcefVar.copyOnWrite();
        ((fceg) fcefVar.instance).f = fgth.a(67);
        fceg fcegVar = (fceg) fcefVar.build();
        fcfn fcfnVar = (fcfn) fcfo.a.createBuilder();
        fcfnVar.copyOnWrite();
        fcfo fcfoVar = (fcfo) fcfnVar.instance;
        fcegVar.getClass();
        fcfoVar.g = fcegVar;
        fcfoVar.b |= 1;
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        eyee x = eyee.x(allocate.array());
        fcfnVar.copyOnWrite();
        ((fcfo) fcfnVar.instance).d = x;
        return fcfnVar;
    }

    public static fcfn b(Context context, byte[] bArr, UUID uuid) {
        fcfn a = a(context, uuid);
        eyee x = eyee.x(bArr);
        a.copyOnWrite();
        fcfo fcfoVar = (fcfo) a.instance;
        fcfo fcfoVar2 = fcfo.a;
        fcfoVar.f = x;
        return a;
    }
}
