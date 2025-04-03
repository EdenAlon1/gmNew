package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iki {
    public final List a;
    public final ikd b;
    public final int c;
    public final int d;
    public int e;

    public iki(List list) {
        this(list, null);
    }

    public final MotionEvent a() {
        ikd ikdVar = this.b;
        if (ikdVar != null) {
            return ikdVar.b.b;
        }
        return null;
    }

    public iki(List list, ikd ikdVar) {
        this.a = list;
        this.b = ikdVar;
        MotionEvent a = a();
        int i = 0;
        this.c = a != null ? a.getButtonState() : 0;
        MotionEvent a2 = a();
        this.d = a2 != null ? a2.getMetaState() : 0;
        MotionEvent a3 = a();
        if (a3 != null) {
            int actionMasked = a3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                iku ikuVar = (iku) list.get(i);
                if (ikj.f(ikuVar)) {
                    i = 2;
                } else if (ikj.d(ikuVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.e = i;
    }
}
