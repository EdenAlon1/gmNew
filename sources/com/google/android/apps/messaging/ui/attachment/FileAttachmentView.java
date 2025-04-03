package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.bcse;
import defpackage.crii;
import defpackage.cxmf;
import defpackage.cxnu;
import defpackage.cxqh;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileAttachmentView extends cxnu implements crii {
    FileIcon a;
    boolean b;
    int c;
    int d;
    GradientDrawable e;
    MessagePartCoreData f;
    int g;
    public cxqh h;
    private Uri i;

    public FileAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.layout.file_attachment_view);
    }

    private final boolean h(boolean z, boolean z2, int i) {
        int d = this.h.d();
        if (z2) {
            d = this.d;
        }
        boolean z3 = true;
        if (this.c == d && this.b == z && isSelected() == z2 && this.g == i) {
            z3 = false;
        }
        this.b = z;
        this.c = d;
        this.g = i;
        setSelected(z2);
        return z3;
    }

    public void a(float[] fArr) {
        if (this.e == null) {
            this.e = cxqh.o(getContext());
        }
        this.e.setColor(cxqh.c(getContext(), isSelected()));
        this.e.setCornerRadii(fArr);
        setBackground(this.e);
        cxmf.a(this, fArr);
    }

    final void b() {
        cxmf.c(this, this.f, new Predicate() { // from class: cxnr
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
                return le.v((String) obj);
            }
        });
        FileIcon fileIcon = this.a;
        boolean z = this.b;
        int i = this.c;
        boolean isSelected = isSelected();
        if (fileIcon.b == z && fileIcon.d == i && fileIcon.isSelected() == isSelected) {
            return;
        }
        fileIcon.b = z;
        fileIcon.d = i;
        fileIcon.setSelected(isSelected);
        fileIcon.a();
    }

    @Override // defpackage.crii
    public final void c() {
        this.f = null;
        this.i = null;
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        if (h(bcseVar.az(), z, bcseVar.c())) {
            b();
        }
        a(fArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // defpackage.crii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r5, boolean r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            com.google.android.apps.messaging.ui.attachment.FileIcon r7 = r4.a
            java.lang.String r8 = r5.V()
            r7.c = r8
            if (r5 != 0) goto Lc
            r7 = 0
            goto L10
        Lc:
            android.net.Uri r7 = r5.t()
        L10:
            r4.f = r5
            boolean r5 = r5.bz()
            r8 = 0
            r0 = -1
            if (r5 == 0) goto L6d
            com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r5 = r4.f
            java.lang.String r5 = r5.V()
            int r1 = r5.hashCode()
            r2 = -1248334925(0xffffffffb597ebb3, float:-1.1318974E-6)
            r3 = 1
            if (r1 == r2) goto L3a
            r2 = 326991069(0x137d7cdd, float:3.1994652E-27)
            if (r1 == r2) goto L30
            goto L44
        L30:
            java.lang.String r1 = "text/x-vCalendar"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L44
            r5 = r3
            goto L45
        L3a:
            java.lang.String r1 = "application/pdf"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L44
            r5 = r8
            goto L45
        L44:
            r5 = r0
        L45:
            if (r5 == 0) goto L61
            if (r5 == r3) goto L55
            android.content.Context r5 = r4.getContext()
            r1 = 2132088656(0x7f151750, float:1.9817602E38)
            java.lang.String r5 = r5.getString(r1)
            goto L78
        L55:
            android.content.Context r5 = r4.getContext()
            r1 = 2132083234(0x7f150222, float:1.9806605E38)
            java.lang.String r5 = r5.getString(r1)
            goto L78
        L61:
            android.content.Context r5 = r4.getContext()
            r1 = 2132086171(0x7f150d9b, float:1.9812562E38)
            java.lang.String r5 = r5.getString(r1)
            goto L78
        L6d:
            android.content.Context r5 = r4.getContext()
            r1 = 2132088721(0x7f151791, float:1.9817734E38)
            java.lang.String r5 = r5.getString(r1)
        L78:
            r4.setContentDescription(r5)
            android.net.Uri r5 = r4.i
            java.lang.String r1 = ""
            if (r5 != 0) goto L83
            r5 = r1
            goto L87
        L83:
            java.lang.String r5 = r5.toString()
        L87:
            if (r7 != 0) goto L8a
            goto L8e
        L8a:
            java.lang.String r1 = r7.toString()
        L8e:
            boolean r6 = r4.h(r6, r8, r0)
            boolean r5 = android.text.TextUtils.equals(r5, r1)
            if (r5 != 0) goto L99
            goto L9b
        L99:
            if (r6 == 0) goto La0
        L9b:
            r4.i = r7
            r4.b()
        La0:
            r4.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.attachment.FileAttachmentView.g(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, boolean, java.lang.String, int):void");
    }

    public FileAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), i, this);
        this.d = context.getColor(R.color.primary_color);
        this.a = (FileIcon) findViewById(R.id.file_icon);
    }
}
