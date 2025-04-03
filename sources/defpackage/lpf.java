package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class lpf {
    private static final Object d = new Object();
    private static lpf e;
    public final Context a;
    private final Handler g;
    public final HashMap b = new HashMap();
    private final HashMap f = new HashMap();
    public final ArrayList c = new ArrayList();

    private lpf(Context context) {
        this.a = context;
        this.g = new lpc(this, context.getMainLooper());
    }

    public static lpf a(Context context) {
        lpf lpfVar;
        synchronized (d) {
            if (e == null) {
                e = new lpf(context.getApplicationContext());
            }
            lpfVar = e;
        }
        return lpfVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            lpe lpeVar = new lpe(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(lpeVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f.put(action, arrayList2);
                }
                arrayList2.add(lpeVar);
            }
        }
    }

    public final void c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                lpe lpeVar = (lpe) arrayList.get(size);
                lpeVar.d = true;
                for (int i = 0; i < lpeVar.a.countActions(); i++) {
                    String action = lpeVar.a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f.get(action);
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            lpe lpeVar2 = (lpe) arrayList2.get(size2);
                            if (lpeVar2.b == broadcastReceiver) {
                                lpeVar2.d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void d(Intent intent) {
        ArrayList arrayList;
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList2 = (ArrayList) this.f.get(intent.getAction());
            if (arrayList2 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", a.n(arrayList2, "Action list: "));
                }
                ArrayList arrayList3 = null;
                int i = 0;
                while (i < arrayList2.size()) {
                    lpe lpeVar = (lpe) arrayList2.get(i);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + lpeVar.a);
                    }
                    if (lpeVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                    } else {
                        int match = lpeVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                StringBuilder sb = new StringBuilder();
                                arrayList = arrayList2;
                                sb.append("  Filter matched!  match=0x");
                                sb.append(Integer.toHexString(match));
                                Log.v("LocalBroadcastManager", sb.toString());
                            } else {
                                arrayList = arrayList2;
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(lpeVar);
                            lpeVar.c = true;
                        } else {
                            arrayList = arrayList2;
                            if (z) {
                                Log.v("LocalBroadcastManager", a.t(match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE : GroupManagementRequest.DATA_TAG : GroupManagementRequest.ACTION_TAG : "category", "  Filter did not match: "));
                            }
                        }
                    }
                    i++;
                    arrayList2 = arrayList;
                }
                if (arrayList3 != null) {
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        ((lpe) arrayList3.get(i2)).c = false;
                    }
                    this.c.add(new lpd(intent, arrayList3));
                    if (!this.g.hasMessages(1)) {
                        this.g.sendEmptyMessage(1);
                    }
                }
            }
        }
    }
}
