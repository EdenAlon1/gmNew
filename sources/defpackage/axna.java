package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axna implements axmw {
    private final aolr a;

    public axna(aolr aolrVar) {
        this.a = aolrVar;
    }

    @Override // defpackage.axmw
    public final ckbx a(Context context, int i, MessageIdType messageIdType, engw engwVar, String str) {
        ArrayList<? extends Parcelable> arrayList;
        try {
            Intent intent = new Intent(context, (Class<?>) axmu.class);
            intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT");
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID", messageIdType.b());
            intent.putExtra("com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID", i);
            Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.SEND_MESSAGE");
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS", (String[]) Collection.EL.stream(engwVar).map(new Function() { // from class: axmx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return emxe.b(((aoku) obj).n());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).toArray(new IntFunction() { // from class: axmy
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return new String[i2];
                }
            }));
            cfva cfvaVar = aoqm.a;
            if (((Boolean) new aops().get()).booleanValue()) {
                if (((Boolean) new aoor().get()).booleanValue()) {
                    Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: axmz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return aolm.f((aoku) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = engw.d;
                    arrayList = new ArrayList<>((java.util.Collection<? extends Object>) map.collect(endq.a));
                } else {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    int size = engwVar.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList2.add(aolm.f(this.a.u(((aoku) engwVar.get(i3)).n(), i)));
                    }
                    arrayList = arrayList2;
                }
                intent2.putParcelableArrayListExtra("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS_MI", arrayList);
            }
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.TEXT", str);
            intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
            axnc.a(context, intent2);
            return ckbx.i;
        } catch (Exception e) {
            csjy.h("BugleWearable", e, "CloudSyncSender: failed to send cloud sync message ".concat(e.toString()));
            ckbw j = ckbx.j(2, 0);
            j.b(1);
            return j.a();
        }
    }

    @Override // defpackage.axmw
    public final void b(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.DELETE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        axnc.a(context, intent);
    }

    @Override // defpackage.axmw
    public final void c(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) axmu.class);
        intent.setAction("com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        Intent intent2 = new Intent("com.google.android.apps.messaging.cloudsync.action.DOWNLOAD_ATTACHMENTS");
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.ID", str);
        intent2.putExtra("com.google.android.apps.messaging.cloudsync.extra.PENDING_INTENT", PendingIntent.getBroadcast(context, 0, intent, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        intent2.putExtras(bundle);
        axnc.a(context, intent2);
    }

    @Override // defpackage.axmw
    public final void d(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.GET_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        axnc.a(context, intent);
    }

    @Override // defpackage.axmw
    public final void e(Context context, String[] strArr) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        axnc.a(context, intent);
    }

    @Override // defpackage.axmw
    public final void f(Context context, String[] strArr, boolean z) {
        Intent intent = new Intent("com.google.android.apps.messaging.cloudsync.action.UPDATE_MESSAGES");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.IDS", strArr);
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.READ", true);
        if (z) {
            intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", true);
        }
        axnc.a(context, intent);
    }
}
