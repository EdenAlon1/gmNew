package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfm implements dlfk {
    private final Map a;
    private final Optional b;

    public dlfm(Map map, Optional optional) {
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.dlfk
    public final void a(dlgb dlgbVar, dlht dlhtVar, rum rumVar) {
        Object obj;
        int i;
        String str;
        dlhtVar.getClass();
        Iterator it = dlhtVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dlhk) obj).d != null) {
                    break;
                }
            }
        }
        dlhk dlhkVar = (dlhk) obj;
        long b = dlfd.b(dlgbVar);
        eyee eyeeVar = dlhtVar.e;
        long j = dlhtVar.b;
        byte[] I = eyeeVar.I();
        long g = ffpw.g(j);
        long g2 = dlhkVar != null ? ffpw.g(dlhkVar.b) : 0L;
        int i2 = 3;
        switch (dlfl.b(dlhtVar.a.a) - 1) {
            case 0:
                i = 8;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 9;
                break;
        }
        int a = dlfl.a(dlhtVar.a.b) - 1;
        if (a == 0) {
            i2 = 7;
        } else if (a == 1) {
            i2 = 2;
        } else if (a != 2) {
            i2 = a != 3 ? a != 4 ? 6 : 5 : 4;
        }
        if (dlhkVar == null || (str = dlhkVar.d) == null) {
            str = "";
        }
        String str2 = dlgbVar.a;
        int c = dlfd.c(2) - 1;
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(211400);
        newBuilder.writeString(str2);
        newBuilder.writeLong(b);
        if (I == null) {
            I = new byte[0];
        }
        newBuilder.writeByteArray(I);
        newBuilder.writeLong(g);
        newBuilder.writeLong(g2);
        newBuilder.writeInt(i - 1);
        newBuilder.writeInt(i2 - 1);
        newBuilder.writeString(str);
        newBuilder.writeInt(c);
        newBuilder.writeLong(0L);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    @Override // defpackage.dlfk
    public final void b(dlgb dlgbVar, eyee eyeeVar, rtm rtmVar) {
        int a;
        int a2;
        int a3;
        dlgbVar.getClass();
        dlgd dlgdVar = (dlgd) this.a.get(dlgbVar.b);
        if (dlgdVar == null) {
            dlgdVar = dlgd.a;
        }
        int i = rtmVar.c;
        int a4 = rui.a(i);
        int i2 = 3;
        int i3 = 2;
        if ((a4 != 0 && a4 == 2) || (((a = rui.a(i)) != 0 && a == 7) || (((a2 = rui.a(i)) != 0 && a2 == 8) || ((a3 = rui.a(i)) != 0 && a3 == 10)))) {
            String str = dlgbVar.a;
            long b = dlfd.b(dlgbVar);
            byte[] I = eyeeVar.I();
            long j = rtmVar.d;
            int a5 = ruk.a(rtmVar.f);
            if (a5 == 0) {
                a5 = 1;
            }
            int a6 = dlfd.a(rtmVar);
            rsq rsqVar = rtmVar.e;
            if (rsqVar == null) {
                rsqVar = rsq.a;
            }
            int a7 = rtw.a(rsqVar.d);
            if (a7 == 0) {
                a7 = 1;
            }
            int a8 = rui.a(rtmVar.c);
            if (a8 == 0) {
                a8 = 1;
            }
            int i4 = a8 - 1;
            if (i4 == 1) {
                i3 = 1;
            } else if (i4 == 9) {
                i3 = 4;
            } else if (i4 != 6) {
                i3 = i4 != 7 ? 0 : 3;
            }
            int i5 = dlgdVar.f;
            int i6 = dlgdVar.g;
            int i7 = dlgdVar.h;
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(211403);
            newBuilder.writeString(str);
            newBuilder.writeLong(b);
            if (I == null) {
                I = new byte[0];
            }
            newBuilder.writeByteArray(I);
            newBuilder.writeLong(j);
            newBuilder.writeInt(a5 - 1);
            newBuilder.writeInt(a6);
            newBuilder.writeInt(a7 - 1);
            newBuilder.writeInt(i3);
            newBuilder.writeInt(0);
            newBuilder.writeInt(0);
            newBuilder.writeInt(0);
            newBuilder.writeLong(0L);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
            return;
        }
        String str2 = dlgbVar.a;
        long b2 = dlfd.b(dlgbVar);
        long j2 = rtmVar.d;
        int a9 = ruk.a(rtmVar.f);
        if (a9 == 0) {
            a9 = 1;
        }
        int a10 = rui.a(rtmVar.c);
        if (a10 == 0) {
            a10 = 1;
        }
        int i8 = a10 - 1;
        if (i8 == 2) {
            i2 = 1;
        } else if (i8 == 3) {
            i2 = 2;
        } else if (i8 != 4) {
            i2 = 5;
            if (i8 == 5) {
                i2 = 4;
            } else if (i8 != 8) {
                i2 = i8 != 10 ? 0 : 6;
            }
        }
        rsq rsqVar2 = rtmVar.e;
        if (rsqVar2 == null) {
            rsqVar2 = rsq.a;
        }
        int a11 = rtw.a(rsqVar2.d);
        if (a11 == 0) {
            a11 = 1;
        }
        int a12 = dlfd.a(rtmVar);
        int i9 = dlgdVar.f;
        int i10 = dlgdVar.g;
        int i11 = dlgdVar.h;
        int a13 = rua.a(rtmVar.g);
        int i12 = a13 == 0 ? 1 : a13;
        StatsEvent.Builder newBuilder2 = StatsEvent.newBuilder();
        newBuilder2.setAtomId(211404);
        newBuilder2.writeString(str2);
        newBuilder2.writeLong(b2);
        newBuilder2.writeLong(j2);
        newBuilder2.writeInt(a9 - 1);
        newBuilder2.writeInt(i2);
        newBuilder2.writeInt(a11 - 1);
        newBuilder2.writeInt(a12);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(i12 - 1);
        newBuilder2.writeLong(0L);
        newBuilder2.usePooledBuffer();
        StatsLog.write(newBuilder2.build());
    }

    @Override // defpackage.dlfk
    public final void c(dlgb dlgbVar, eyee eyeeVar, rto rtoVar) {
        dlgbVar.getClass();
    }

    @Override // defpackage.dlfk
    public final void d(dlgb dlgbVar, eyee eyeeVar, long j, int i, int i2, int i3) {
        dlgbVar.getClass();
        eyeeVar.getClass();
        if (i == 0 || i2 == 0 || i3 == 0) {
            throw null;
        }
        dlgd dlgdVar = (dlgd) this.a.get(dlgbVar.b);
        if (dlgdVar == null) {
            dlgdVar = dlgd.a;
        }
        String str = dlgbVar.a;
        long b = dlfd.b(dlgbVar);
        int c = dlfd.c(i);
        int a = dlfh.a(i2);
        int i4 = dlgdVar.f;
        int i5 = dlgdVar.g;
        int i6 = dlgdVar.h;
        byte[] I = eyeeVar.I();
        int a2 = ezgo.a(i3);
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(211407);
        newBuilder.writeString(str);
        newBuilder.writeLong(b);
        if (I == null) {
            I = new byte[0];
        }
        newBuilder.writeByteArray(I);
        newBuilder.writeLong(j);
        newBuilder.writeInt(c - 1);
        newBuilder.writeInt(a - 1);
        newBuilder.writeInt(0);
        newBuilder.writeInt(0);
        newBuilder.writeInt(0);
        newBuilder.writeInt(a2);
        newBuilder.writeLong(0L);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    @Override // defpackage.dlfk
    public final void e(dlgb dlgbVar, long j, eyee eyeeVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        dlgd dlgdVar = (dlgd) this.a.get(dlgbVar.b);
        if (dlgdVar == null) {
            dlgdVar = dlgd.a;
        }
        if (i == 1) {
            String str = dlgbVar.a;
            long b = dlfd.b(dlgbVar);
            byte[] I = eyeeVar.I();
            int i3 = dlgdVar.f;
            int i4 = dlgdVar.g;
            int i5 = dlgdVar.h;
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(211401);
            newBuilder.writeString(str);
            newBuilder.writeLong(b);
            if (I == null) {
                I = new byte[0];
            }
            newBuilder.writeByteArray(I);
            newBuilder.writeLong(j);
            newBuilder.writeInt(0);
            newBuilder.writeInt(0);
            newBuilder.writeInt(0);
            newBuilder.writeLong(0L);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
            return;
        }
        String str2 = dlgbVar.a;
        long b2 = dlfd.b(dlgbVar);
        int b3 = dlfh.b(i);
        int i6 = dlgdVar.f;
        int i7 = dlgdVar.g;
        int i8 = dlgdVar.h;
        int a = ezgo.a(i2);
        StatsEvent.Builder newBuilder2 = StatsEvent.newBuilder();
        newBuilder2.setAtomId(211402);
        newBuilder2.writeString(str2);
        newBuilder2.writeLong(b2);
        newBuilder2.writeInt(b3 - 1);
        newBuilder2.writeLong(j);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(0);
        newBuilder2.writeInt(a);
        newBuilder2.writeLong(0L);
        newBuilder2.usePooledBuffer();
        StatsLog.write(newBuilder2.build());
    }

    @Override // defpackage.dlfk
    public final void f(dlgb dlgbVar, int i) {
        if (((Boolean) fflm.a(this.b, false)).booleanValue()) {
            long b = dlfd.b(dlgbVar);
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(211409);
            newBuilder.writeString(dlgbVar.a);
            newBuilder.writeLong(b);
            newBuilder.writeLong(0L);
            newBuilder.writeInt(i - 1);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
        }
    }
}
