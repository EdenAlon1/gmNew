package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikw extends dikk {
    public dikw(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        super(djixVar, dkppVar, epluVar, errlVar, dijtVar);
    }

    public final void d(Context context, int i) {
        ezdo ezdoVar = (ezdo) ezdr.a.createBuilder();
        ezdoVar.copyOnWrite();
        ezdr ezdrVar = (ezdr) ezdoVar.instance;
        ezdrVar.d = i - 1;
        ezdrVar.b |= 2;
        ezdoVar.copyOnWrite();
        ezdr ezdrVar2 = (ezdr) ezdoVar.instance;
        ezdrVar2.c = 3;
        ezdrVar2.b |= 1;
        ezdr ezdrVar3 = (ezdr) ezdoVar.build();
        ezbm J = J();
        J.copyOnWrite();
        ezbn ezbnVar = (ezbn) J.instance;
        ezbn ezbnVar2 = ezbn.a;
        ezdrVar3.getClass();
        ezbnVar.d = ezdrVar3;
        ezbnVar.c = 10;
        super.H(context, (ezbn) J.build());
    }
}
