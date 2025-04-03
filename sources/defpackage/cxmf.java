package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxmf {
    public static void a(View view, float[] fArr) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setAntiAlias(false);
        ColorStateList valueOf = ColorStateList.valueOf(ehdr.b(view, R.attr.colorOnSurfaceStateLayer));
        if (valueOf == null) {
            return;
        }
        view.setForeground(new RippleDrawable(valueOf, null, shapeDrawable));
    }

    public static void b(View view, MessagePartCoreData messagePartCoreData) {
        c(view, messagePartCoreData, new Predicate() { // from class: cxme
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return true;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.view.View r8, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r9, java.util.function.Predicate r10) {
        /*
            r0 = 2131428331(0x7f0b03eb, float:1.8478303E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131428330(0x7f0b03ea, float:1.8478301E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r9 == 0) goto L24
            boolean r3 = r9.aY()
            if (r3 == 0) goto L24
            java.lang.String r10 = r9.Y()
            r0.setText(r10)
            goto L91
        L24:
            if (r9 == 0) goto L83
            java.lang.String r3 = r9.V()
            boolean r10 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r10, r3)
            if (r10 == 0) goto L83
            android.content.Context r10 = r8.getContext()
            java.lang.String r3 = r9.V()
            r4 = 2132088656(0x7f151750, float:1.9817602E38)
            if (r3 != 0) goto L42
            java.lang.String r10 = r10.getString(r4)
            goto L7f
        L42:
            int r5 = r3.hashCode()
            r6 = -1248334925(0xffffffffb597ebb3, float:-1.1318974E-6)
            r7 = 1
            if (r5 == r6) goto L5c
            r6 = 326991069(0x137d7cdd, float:3.1994652E-27)
            if (r5 == r6) goto L52
            goto L66
        L52:
            java.lang.String r5 = "text/x-vCalendar"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L66
            r3 = r7
            goto L67
        L5c:
            java.lang.String r5 = "application/pdf"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L66
            r3 = r2
            goto L67
        L66:
            r3 = -1
        L67:
            if (r3 == 0) goto L78
            if (r3 == r7) goto L70
            java.lang.String r10 = r10.getString(r4)
            goto L7f
        L70:
            r3 = 2132088799(0x7f1517df, float:1.9817892E38)
            java.lang.String r10 = r10.getString(r3)
            goto L7f
        L78:
            r3 = 2132086172(0x7f150d9c, float:1.9812564E38)
            java.lang.String r10 = r10.getString(r3)
        L7f:
            r0.setText(r10)
            goto L91
        L83:
            android.content.Context r10 = r8.getContext()
            r3 = 2132088721(0x7f151791, float:1.9817734E38)
            java.lang.String r10 = r10.getString(r3)
            r0.setText(r10)
        L91:
            android.content.Context r10 = r8.getContext()
            int r10 = defpackage.cxqh.f(r10)
            r0.setTextColor(r10)
            if (r9 == 0) goto Ld2
            long r3 = r9.p()
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto Ld2
            android.content.Context r10 = r8.getContext()
            long r3 = r9.p()
            java.lang.String r9 = android.text.format.Formatter.formatFileSize(r10, r3)
            android.content.Context r10 = r8.getContext()
            java.util.Locale r10 = defpackage.ctid.c(r10)
            java.lang.String r9 = r9.toUpperCase(r10)
            r1.setText(r9)
            android.content.Context r8 = r8.getContext()
            int r8 = defpackage.cxqh.g(r8)
            r1.setTextColor(r8)
            r1.setVisibility(r2)
            return
        Ld2:
            r8 = 8
            r1.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxmf.c(android.view.View, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.util.function.Predicate):void");
    }
}
