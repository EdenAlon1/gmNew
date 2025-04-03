package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjr {
    public static final cjr a;
    public static final cjr b;
    public final int c;
    public final cjp d;
    public final boolean e;

    static {
        cjq cjqVar = new cjq();
        cjqVar.a = 0;
        cjqVar.b = cjp.b;
        cjqVar.c = false;
        cjr cjrVar = new cjr(cjqVar);
        a = cjrVar;
        cjq cjqVar2 = new cjq(cjrVar);
        cjqVar2.a = 2;
        cjqVar2.b = cjp.c;
        cjqVar2.c = false;
        new cjq(cjrVar).b = cjp.d;
        cjq cjqVar3 = new cjq(cjrVar);
        cjqVar3.b = cjp.d;
        cjqVar3.c = true;
        cjq cjqVar4 = new cjq(cjrVar);
        cjqVar4.b = cjp.d;
        cjqVar4.c = true;
        cjq cjqVar5 = new cjq(cjrVar);
        cjqVar5.b = cjp.e;
        cjqVar5.c = true;
        b = new cjr(cjqVar5);
    }

    public cjr(cjq cjqVar) {
        this.c = cjqVar.a;
        this.d = cjqVar.b;
        this.e = cjqVar.c;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chp chpVar = (chp) it.next();
            if (chpVar instanceof Row) {
                cjp cjpVar = this.d;
                Row row = (Row) chpVar;
                if (!cjpVar.j && row.getOnClickDelegate() != null) {
                    throw new IllegalArgumentException("A click listener is not allowed on the row");
                }
                if (!cjpVar.i && row.getToggle() != null) {
                    throw new IllegalArgumentException("A toggle is not allowed on the row");
                }
                CarIcon image = row.getImage();
                if (image != null) {
                    if (!cjpVar.h) {
                        throw new IllegalArgumentException("An image is not allowed on the row");
                    }
                    cjpVar.k.a(image);
                }
                if (row.getTexts().size() > cjpVar.f) {
                    throw new IllegalArgumentException("The number of lines of texts for the row exceeded the supported max of " + cjpVar.f);
                }
            } else if (!(chpVar instanceof ConversationItem)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", chpVar.getClass().getSimpleName()));
            }
        }
    }
}
