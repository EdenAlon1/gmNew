package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtn extends crzo {
    public MessageCoreData a;
    public ParticipantsTable.BindData b;
    public ParticipantsTable.BindData c;
    public bseh d;
    public bton e;
    public engw f;
    public engw g;
    public enhk h;
    public engw i;

    @Override // defpackage.crzo
    public final void a(enhk enhkVar) {
        if (enhkVar == null) {
            throw new NullPointerException("Null cmsData");
        }
        this.h = enhkVar;
    }

    @Override // defpackage.crzo
    public final void b(List list) {
        this.f = engw.n(list);
    }

    @Override // defpackage.crzo
    public final void c(List list) {
        this.i = engw.n(list);
    }

    @Override // defpackage.crzo
    public final void d(List list) {
        this.g = engw.n(list);
    }
}
