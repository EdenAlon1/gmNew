package defpackage;

import android.os.Binder;
import android.os.IBinder;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phm {
    private static final String a;
    private final phk b = new phk(this);
    private final phl c = new phl(this);

    static {
        int i = fflc.a;
        a = new ffkb(phm.class).c();
        new Binder();
    }

    public static final pgz b(ActivityStack activityStack) {
        List activities;
        boolean isEmpty;
        ActivityStack.Token activityStackToken;
        activityStack.getClass();
        int d = d();
        if (d > 0 && d < 5) {
            return phj.a(activityStack);
        }
        activities = activityStack.getActivities();
        activities.getClass();
        isEmpty = activityStack.isEmpty();
        activityStackToken = activityStack.getActivityStackToken();
        return new pgz(activities, isEmpty, activityStackToken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0148, code lost:
    
        if (r8 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.plg c(androidx.window.extensions.embedding.SplitAttributes r8) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phm.c(androidx.window.extensions.embedding.SplitAttributes):plg");
    }

    private static final int d() {
        return new pgk().a;
    }

    private static final php e(AnimationBackground animationBackground) {
        int color;
        new pgk().a(5);
        if (!pgq$$ExternalSyntheticApiModelOutline0.m627m((Object) animationBackground)) {
            return php.a;
        }
        php phpVar = php.a;
        color = pgq$$ExternalSyntheticApiModelOutline0.m608m((Object) animationBackground).getColor();
        return new phn(color);
    }

    private static final phq f(int i) {
        new pgk().a(7);
        return i == 0 ? phq.b : phq.a;
    }

    public final void a(List list) {
        ActivityStack primaryActivityStack;
        ActivityStack secondaryActivityStack;
        SplitAttributes splitAttributes;
        SplitInfo.Token splitInfoToken;
        pli pliVar;
        pli pliVar2;
        ActivityStack primaryActivityStack2;
        ActivityStack secondaryActivityStack2;
        SplitAttributes splitAttributes2;
        IBinder token;
        ActivityStack primaryActivityStack3;
        ActivityStack secondaryActivityStack3;
        SplitAttributes splitAttributes3;
        ActivityStack primaryActivityStack4;
        ActivityStack secondaryActivityStack4;
        float splitRatio;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SplitInfo m618m = pgq$$ExternalSyntheticApiModelOutline0.m618m(it.next());
            int d = d();
            if (d == 1) {
                m618m.getClass();
                primaryActivityStack4 = m618m.getPrimaryActivityStack();
                primaryActivityStack4.getClass();
                pgz a2 = phj.a(primaryActivityStack4);
                secondaryActivityStack4 = m618m.getSecondaryActivityStack();
                secondaryActivityStack4.getClass();
                pgz a3 = phj.a(secondaryActivityStack4);
                plb plbVar = new plb();
                plf plfVar = plf.a;
                splitRatio = m618m.getSplitRatio();
                plbVar.b(splitRatio == plf.a.d ? plf.a : ple.a(splitRatio));
                plbVar.a = plc.a;
                pliVar = new pli(a2, a3, plbVar.a());
            } else {
                if (d == 2) {
                    phk phkVar = this.b;
                    m618m.getClass();
                    phm phmVar = phkVar.a;
                    primaryActivityStack3 = m618m.getPrimaryActivityStack();
                    primaryActivityStack3.getClass();
                    pgz a4 = phj.a(primaryActivityStack3);
                    phm phmVar2 = phkVar.a;
                    secondaryActivityStack3 = m618m.getSecondaryActivityStack();
                    secondaryActivityStack3.getClass();
                    pgz a5 = phj.a(secondaryActivityStack3);
                    phm phmVar3 = phkVar.a;
                    splitAttributes3 = m618m.getSplitAttributes();
                    splitAttributes3.getClass();
                    pliVar2 = new pli(a4, a5, c(splitAttributes3));
                } else if (d < 3 || d >= 5) {
                    primaryActivityStack = m618m.getPrimaryActivityStack();
                    primaryActivityStack.getClass();
                    pgz b = b(primaryActivityStack);
                    secondaryActivityStack = m618m.getSecondaryActivityStack();
                    secondaryActivityStack.getClass();
                    pgz b2 = b(secondaryActivityStack);
                    splitAttributes = m618m.getSplitAttributes();
                    splitAttributes.getClass();
                    plg c = c(splitAttributes);
                    splitInfoToken = m618m.getSplitInfoToken();
                    splitInfoToken.getClass();
                    pliVar = new pli(b, b2, c, null, splitInfoToken);
                } else {
                    phl phlVar = this.c;
                    m618m.getClass();
                    phm phmVar4 = phlVar.a;
                    primaryActivityStack2 = m618m.getPrimaryActivityStack();
                    primaryActivityStack2.getClass();
                    pgz a6 = phj.a(primaryActivityStack2);
                    phm phmVar5 = phlVar.a;
                    secondaryActivityStack2 = m618m.getSecondaryActivityStack();
                    secondaryActivityStack2.getClass();
                    pgz a7 = phj.a(secondaryActivityStack2);
                    phm phmVar6 = phlVar.a;
                    splitAttributes2 = m618m.getSplitAttributes();
                    splitAttributes2.getClass();
                    plg c2 = c(splitAttributes2);
                    token = m618m.getToken();
                    token.getClass();
                    pliVar2 = new pli(a6, a7, c2, token);
                }
                pliVar = pliVar2;
            }
            arrayList.add(pliVar);
        }
    }
}
