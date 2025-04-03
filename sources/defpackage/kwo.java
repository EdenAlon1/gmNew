package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwo extends WindowInsetsAnimation$Callback {
    private final kwi a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public kwo(kwi kwiVar) {
        super(kwiVar.c);
        this.d = new HashMap();
        this.a = kwiVar;
    }

    private final kwr a(WindowInsetsAnimation windowInsetsAnimation) {
        kwr kwrVar = (kwr) this.d.get(windowInsetsAnimation);
        if (kwrVar != null) {
            return kwrVar;
        }
        kwr kwrVar2 = new kwr(windowInsetsAnimation);
        this.d.put(windowInsetsAnimation, kwrVar2);
        return kwrVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.a.d();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.b(kxh.o(windowInsets), this.b).e();
            }
            WindowInsetsAnimation m = jqg$$ExternalSyntheticApiModelOutline9.m(list.get(size));
            kwr a = a(m);
            fraction = m.getFraction();
            a.d(fraction);
            this.c.add(a);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        kwh e = this.a.e(new kwh(bounds));
        return new WindowInsetsAnimation.Bounds(e.a.a(), e.b.a());
    }
}
