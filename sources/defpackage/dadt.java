package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadt extends BaseAdapter implements dadx {
    public engw a;
    public final csxu b;
    public final Map c;
    public final ersv d;
    public final Consumer e;
    private final LayoutInflater f;

    public dadt(csxu csxuVar, ersv ersvVar, Consumer consumer, Context context) {
        this.f = LayoutInflater.from(context);
        this.a = DebugGServiceKeysFragment.a(ersvVar);
        this.b = csxuVar;
        this.d = ersvVar;
        this.e = consumer;
        this.c = csxuVar.f();
    }

    @Override // defpackage.dadx
    public final void a(final String str, final String str2, final String str3) {
        DebugGServiceKeysFragment.b(str).ifPresentOrElse(new Consumer() { // from class: dadp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String str4 = str3;
                dadt dadtVar = dadt.this;
                ersv ersvVar = dadtVar.d;
                String str5 = (String) obj;
                boolean parseBoolean = Boolean.parseBoolean(str4);
                dadtVar.d.c(str5, parseBoolean == ersvVar.d(str5) ? Optional.empty() : Optional.of(Boolean.valueOf(parseBoolean)));
                dadtVar.e.o(dadtVar.d.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dadq
            @Override // java.lang.Runnable
            public final void run() {
                String str4 = str;
                String str5 = str2;
                Bundle bundle = csya.c;
                String str6 = str3;
                if (bundle == null) {
                    csya.c = new Bundle();
                }
                try {
                    if ("int".equals(str5)) {
                        csya.c.putInt(str4, Integer.parseInt(str6));
                        return;
                    }
                    if (ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG.equals(str5)) {
                        csya.c.putLong(str4, Long.parseLong(str6));
                        return;
                    }
                    if ("float".equals(str5)) {
                        csya.c.putFloat(str4, Float.parseFloat(str6));
                        return;
                    }
                    if ("bool".equals(str5)) {
                        csya.c.putBoolean(str4, Boolean.parseBoolean(str6));
                    } else {
                        if ("string".equals(str5)) {
                            csya.c.putString(str4, str6);
                            return;
                        }
                        throw new IllegalStateException("Invalid key type " + str5 + ", possibly calling parameters in wrong order?");
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalStateException("GService keys values: invalid " + str4 + "," + str6 + "," + str5, e);
                }
            }
        });
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        final DebugGServiceKeysItemView debugGServiceKeysItemView = view instanceof DebugGServiceKeysItemView ? (DebugGServiceKeysItemView) view : (DebugGServiceKeysItemView) this.f.inflate(R.layout.debug_gservicekeys_item_view, viewGroup, false);
        final String str = (String) this.a.get(i);
        DebugGServiceKeysFragment.b(str).ifPresentOrElse(new Consumer() { // from class: dadr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dadt dadtVar = dadt.this;
                String str2 = (String) obj;
                boolean d = dadtVar.d.d(str2);
                boolean booleanValue = ((Boolean) dadtVar.d.b(str2).orElse(Boolean.valueOf(d))).booleanValue();
                String valueOf = String.valueOf(booleanValue);
                boolean z = booleanValue != d;
                debugGServiceKeysItemView.a(str, "bool", valueOf, z, dadtVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dads
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
            
                if (r0.equals("bool") != false) goto L29;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 380
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dads.run():void");
            }
        });
        return debugGServiceKeysItemView;
    }
}
