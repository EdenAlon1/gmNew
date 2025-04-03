package com.google.android.libraries.messaging.lighter.ui.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
import defpackage.dzya;
import defpackage.eacu;
import defpackage.emux;
import defpackage.emxc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MessageListView extends PagedRecyclerView implements dzya {
    public emxc ae;

    public MessageListView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ae = emux.a;
        an(new eacu(context));
    }
}
