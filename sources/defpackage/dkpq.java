package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpq {
    private eyxz a = null;

    static Intent a(eyxz eyxzVar) {
        Intent intent = new Intent();
        int i = eyxzVar.c;
        int a = ezfi.a(i);
        if (a != 0 && a == 2) {
            intent.setAction("com.google.android.ims.SIM_LOADED");
            Bundle bundle = new Bundle();
            bundle.putBoolean("SIM_CHANGED", eyxzVar.d);
            intent.putExtras(bundle);
            return intent;
        }
        int a2 = ezfi.a(i);
        if (a2 != 0 && a2 == 3) {
            intent.setAction("com.google.android.ims.SIM_ABSENT");
        }
        return intent;
    }

    final synchronized Intent b() {
        eyxz eyxzVar = this.a;
        if (eyxzVar == null) {
            return null;
        }
        return a(eyxzVar);
    }

    public final synchronized eyxz c() {
        return this.a;
    }

    final synchronized String d() {
        String str;
        eyxz eyxzVar = this.a;
        if (eyxzVar != null) {
            int i = eyxzVar.c;
            int a = ezfi.a(i);
            if (a != 0 && a == 2) {
                str = "LOADED";
            }
            int a2 = ezfi.a(i);
            if (a2 != 0 && a2 == 3) {
                str = "ABSENT";
            }
        }
        str = "UNKNOWN";
        return str;
    }

    public final synchronized void e(eyxz eyxzVar) {
        eyxy eyxyVar = (eyxy) eyxz.a.createBuilder();
        int a = ezfi.a(eyxzVar.c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        eyxyVar.copyOnWrite();
        eyxz eyxzVar2 = (eyxz) eyxyVar.instance;
        eyxzVar2.c = a - 1;
        eyxzVar2.b |= 1;
        String str = eyxzVar.f;
        eyxyVar.copyOnWrite();
        eyxz eyxzVar3 = (eyxz) eyxyVar.instance;
        str.getClass();
        eyxzVar3.b |= 8;
        eyxzVar3.f = str;
        int a2 = ezfg.a(eyxzVar.e);
        if (a2 != 0) {
            i = a2;
        }
        eyxyVar.copyOnWrite();
        eyxz eyxzVar4 = (eyxz) eyxyVar.instance;
        eyxzVar4.e = i - 1;
        eyxzVar4.b |= 4;
        this.a = (eyxz) eyxyVar.build();
    }

    public final boolean f() {
        return "LOADED".equals(d());
    }
}
