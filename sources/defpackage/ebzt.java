package defpackage;

import android.graphics.RectF;
import android.util.Property;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebzt extends Property {
    public ebzt(Class cls) {
        super(cls, "animatedBackgroundRect");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        int i = ExpandableDialogView.m;
        return ((ExpandableDialogView) obj).c;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        int i = ExpandableDialogView.m;
        ((ExpandableDialogView) obj).j((RectF) obj2);
    }
}
