package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjk {
    public static final cjk a;
    public static final cjk b;
    private static final cjk n;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final cjn j;
    public final Set k;
    public final Set l;
    public final Set m;

    static {
        cjj cjjVar = new cjj();
        cjjVar.d = 1;
        cjjVar.c();
        cjjVar.i = false;
        cjk cjkVar = new cjk(cjjVar);
        a = cjkVar;
        cjj cjjVar2 = new cjj();
        cjjVar2.d = 2;
        cjjVar2.c();
        cjjVar2.i = true;
        new cjk(cjjVar2);
        cjj cjjVar3 = new cjj();
        cjjVar3.k = cjn.a;
        cjjVar3.d = 2;
        cjk cjkVar2 = new cjk(cjjVar3);
        n = cjkVar2;
        cjj cjjVar4 = new cjj(cjkVar2);
        cjjVar4.k = cjn.c;
        cjjVar4.f = 2;
        cjjVar4.i = true;
        new cjk(cjjVar4);
        cjj cjjVar5 = new cjj(cjkVar2);
        cjjVar5.k = cjn.c;
        cjjVar5.f = 2;
        cjjVar5.b();
        cjjVar5.i = true;
        new cjk(cjjVar5);
        cjj cjjVar6 = new cjj(cjkVar2);
        cjjVar6.f = 1;
        cjjVar6.k = cjn.d;
        cjjVar6.i = true;
        cjjVar6.d();
        new cjk(cjjVar6);
        cjj cjjVar7 = new cjj(cjkVar2);
        cjjVar7.d = 4;
        cjjVar7.f = 4;
        cjjVar7.b();
        cjjVar7.k = cjn.e;
        cjjVar7.i = true;
        cjjVar7.d();
        new cjk(cjjVar7);
        cjj cjjVar8 = new cjj(cjkVar2);
        cjjVar8.d = 4;
        cjjVar8.b();
        cjjVar8.i = true;
        cjjVar8.d();
        new cjk(cjjVar8);
        cjj cjjVar9 = new cjj();
        cjjVar9.d = 2;
        cjjVar9.f = 2;
        cjjVar9.b();
        cjjVar9.a(1);
        cjjVar9.i = true;
        new cjk(cjjVar9);
        cjj cjjVar10 = new cjj();
        cjjVar10.d = 1;
        cjjVar10.f = 1;
        cjjVar10.a(1);
        cjjVar10.c();
        cjjVar10.i = true;
        new cjk(cjjVar10);
        cjj cjjVar11 = new cjj();
        cjjVar11.d = 2;
        cjjVar11.a(1);
        cjjVar11.a(Action.TYPE_COMPOSE_MESSAGE);
        cjjVar11.c();
        cjjVar11.h = true;
        cjjVar11.i = true;
        b = new cjk(cjjVar11);
        cjj cjjVar12 = new cjj(cjkVar);
        cjjVar12.a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        new cjk(cjjVar12);
    }

    public cjk(cjj cjjVar) {
        int i = cjjVar.d;
        this.c = i;
        this.d = cjjVar.e;
        this.e = cjjVar.f;
        this.j = cjjVar.k;
        this.f = cjjVar.g;
        this.g = cjjVar.h;
        this.h = cjjVar.i;
        this.i = cjjVar.j;
        HashSet hashSet = new HashSet(cjjVar.a);
        this.k = hashSet;
        HashSet hashSet2 = new HashSet(cjjVar.c);
        this.m = hashSet2;
        HashSet hashSet3 = new HashSet(cjjVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!cjjVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.l = new HashSet(cjjVar.b);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(List list) {
        Set hashSet = this.k.isEmpty() ? Collections.EMPTY_SET : new HashSet(this.k);
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (!this.l.isEmpty() && this.l.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            if (!this.m.isEmpty() && !this.m.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i--;
                if (i < 0) {
                    throw new IllegalArgumentException("Action list exceeded max number of " + this.e + " actions with custom titles");
                }
                this.j.a(title);
            }
            i3--;
            if (i3 < 0) {
                throw new IllegalArgumentException("Action list exceeded max number of " + this.c + " actions");
            }
            if ((action.getFlags() & 1) != 0 && i2 - 1 < 0) {
                throw new IllegalArgumentException("Action list exceeded max number of " + this.d + " primary actions");
            }
            if (this.f && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.g && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
            }
            if (!this.g && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.i && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.h && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        sb.toString();
        throw new IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
