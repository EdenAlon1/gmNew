package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewxx {
    public static void a(List list, Bundle bundle) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ewxt ewxtVar = (ewxt) it.next();
            Bundle bundle2 = new Bundle();
            bundle2.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ewxtVar.a);
            bundle2.putFloat("conf", ewxtVar.b);
            bundle2.putInt(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, ewxtVar.d);
            bundle2.putInt(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME, ewxtVar.e);
            bundle2.putBundle("extras", ewxtVar.c);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("gms.textclassifier.entities", arrayList);
    }
}
