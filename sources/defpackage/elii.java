package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.JsonWriter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.fbal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elii extends eliv implements ekhu, fbas, ekhq, ekkk, elar {
    private elio a;
    private boolean ag;
    private Context d;
    private final lkv e = new lkv(this);

    @Deprecated
    public elii() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return elio.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            elio H = H();
            View inflate = layoutInflater.inflate(R.layout.debug_trace_fragment, viewGroup, false);
            kud kudVar = new kud() { // from class: elik
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            };
            int[] iArr = kvo.a;
            kvd.k(inflate, kudVar);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
            recyclerView.aL();
            recyclerView.ap(new LinearLayoutManager());
            recyclerView.am(H.i);
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final elio H() {
        elio elioVar = this.a;
        if (elioVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return elioVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ae(Bundle bundle) {
        this.c.k();
        try {
            aU(bundle);
            elio H = H();
            eldq eldqVar = H.j;
            if (eldqVar != null) {
                H.a(eldqVar);
            } else {
                ejwl ejwlVar = H.d;
                eljl eljlVar = H.e;
                int i = H.h.c;
                emxf.b(i > 0, "rowId must be positive");
                ejwlVar.c(new eljk(eljlVar, i), ejwa.DONT_CARE, H.k);
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eliv, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        super.ah(menu, menuInflater);
        final elio H = H();
        if (H.j != null) {
            menu.add("Share DOT Graph").setOnMenuItemClickListener(new elbk(H.f, "Share DOT Graph", new MenuItem.OnMenuItemClickListener() { // from class: elil
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    elio elioVar = elio.this;
                    eldq eldqVar = elioVar.j;
                    String str = "Undefined";
                    for (ekzx ekzxVar : eldqVar.e) {
                        if (ekzxVar.e == -1) {
                            str = ekzxVar.c;
                        }
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.SUBJECT", "TikTok Trace: ".concat(String.valueOf(str)));
                    StringWriter stringWriter = new StringWriter();
                    try {
                        emww emwwVar = new emww("\\n");
                        stringWriter.append((CharSequence) "digraph tiktok_trace {\n").append((CharSequence) "graph [ranksep=2];\n");
                        for (ekzx ekzxVar2 : eldqVar.e) {
                            char c = 24;
                            Matcher matcher = Pattern.compile(a.f(24, "\\G\\W*(.{1,", "}|.*?)(?=\\W|$)"), 32).matcher(ekzxVar2.c);
                            ArrayList arrayList = new ArrayList();
                            while (matcher.find()) {
                                arrayList.add(matcher.group(1));
                                c = c;
                            }
                            String b = emwwVar.b(arrayList);
                            emww emwwVar2 = emwwVar;
                            stringWriter.append((CharSequence) "T").append((CharSequence) Integer.toString(ekzxVar2.d)).append((CharSequence) " [label=\"").append((CharSequence) b.replace("\"", "\\\"")).append((CharSequence) "\\n").append((CharSequence) Long.toString(Math.max(ekzxVar2.h, 0L))).append((CharSequence) "ms\"").append((CharSequence) " tooltip=\"").append((CharSequence) ekzxVar2.c.replace("\"", "\\\"")).append((CharSequence) "\"");
                            if (b.length() > 48) {
                                stringWriter.append((CharSequence) " fontsize=").append((CharSequence) Integer.toString(12 - Math.min(4, b.length() / 24)));
                            }
                            if (ekzxVar2.k) {
                                stringWriter.append((CharSequence) " fillcolor=orange");
                            }
                            stringWriter.append((CharSequence) "]").append((CharSequence) ";\n");
                            if (ekzxVar2.e != -1) {
                                stringWriter.append((CharSequence) "T").append((CharSequence) Integer.toString(ekzxVar2.e)).append((CharSequence) " -> ").append((CharSequence) "T").append((CharSequence) Integer.toString(ekzxVar2.d)).append((CharSequence) ";\n");
                            }
                            emwwVar = emwwVar2;
                        }
                        stringWriter.append((CharSequence) "}");
                        stringWriter.flush();
                        intent.putExtra("android.intent.extra.TEXT", "Paste this into https://graphviz.corp.google.com/\n\n".concat(String.valueOf(stringWriter.toString())));
                        intent.setType("text/plain");
                        elioVar.a.startActivity(intent);
                        return true;
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                }
            }));
            menu.add("Share Waterfall").setOnMenuItemClickListener(new elbk(H.f, "Share Waterfall", new MenuItem.OnMenuItemClickListener() { // from class: elim
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    String str;
                    elio elioVar = elio.this;
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        Iterator<E> it = elioVar.j.e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str = "Undefined";
                                break;
                            }
                            ekzx ekzxVar = (ekzx) it.next();
                            if (ekzxVar.e == -1) {
                                str = ekzxVar.c;
                                break;
                            }
                        }
                        intent.putExtra("android.intent.extra.SUBJECT", a.t(str, "TikTok Trace: "));
                        String str2 = Build.HARDWARE + "/" + Build.DEVICE + " CPU=" + Runtime.getRuntime().availableProcessors();
                        Set<eldq> singleton = Collections.singleton(elioVar.j);
                        StringWriter stringWriter = new StringWriter();
                        try {
                            emxf.l(true);
                            JsonWriter jsonWriter = new JsonWriter(stringWriter);
                            jsonWriter.beginObject();
                            jsonWriter.name("format");
                            jsonWriter.value(2L);
                            jsonWriter.name("traces");
                            jsonWriter.beginArray();
                            for (eldq eldqVar : singleton) {
                                jsonWriter.beginArray();
                                for (ekzx ekzxVar2 : eldqVar.e) {
                                    jsonWriter.beginArray();
                                    jsonWriter.value(ekzxVar2.d);
                                    jsonWriter.value(ekzxVar2.c);
                                    jsonWriter.value(ekzxVar2.f);
                                    jsonWriter.value(ekzxVar2.f + ekzxVar2.h);
                                    int i = ekzxVar2.e;
                                    jsonWriter.value(i == -1 ? null : Integer.valueOf(i));
                                    jsonWriter.endArray();
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endArray();
                            jsonWriter.endObject();
                            jsonWriter.flush();
                            String stringWriter2 = stringWriter.toString();
                            stringWriter.close();
                            intent.putExtra("android.intent.extra.TEXT", a.m(stringWriter2, str2, "Environment: ", "\n\nPaste this into https://x20web.corp.google.com/teams/tiktok/viewtrace.html\n\n"));
                            intent.setType("text/plain");
                            elioVar.a.startActivity(intent);
                            return true;
                        } finally {
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }));
            menu.add("Share PerfettoTrace").setOnMenuItemClickListener(new elbk(H.f, "Share PerfettoTrace", new MenuItem.OnMenuItemClickListener() { // from class: elin
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    elio elioVar = elio.this;
                    final eldq eldqVar = elioVar.j;
                    final eliz elizVar = elioVar.g;
                    elioVar.c.i(ejlp.b(elizVar.a.submit(eldl.m(new Callable() { // from class: eliy
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i;
                            engw s;
                            int i2;
                            int i3;
                            eliz elizVar2 = eliz.this;
                            File file = new File(elizVar2.b.getFilesDir(), "tiktok_trace");
                            file.mkdirs();
                            File file2 = new File(file, "tiktok-trace.proto");
                            boolean exists = file2.exists();
                            eldq eldqVar2 = eldqVar;
                            if (exists) {
                                file2.delete();
                            }
                            file2.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                int i4 = ekze.a;
                                int i5 = engw.d;
                                engw engwVar = enou.a;
                                HashMap hashMap = new HashMap();
                                for (ekzx ekzxVar : eldqVar2.e) {
                                    Integer valueOf = Integer.valueOf(ekzxVar.e);
                                    if (!hashMap.containsKey(valueOf)) {
                                        hashMap.put(valueOf, new ArrayList());
                                    }
                                    ((ArrayList) hashMap.get(valueOf)).add(Integer.valueOf(ekzxVar.d));
                                }
                                ArrayDeque arrayDeque = new ArrayDeque(eldqVar2.e.size());
                                ekzd ekzdVar = new ekzd(eldqVar2, engwVar);
                                int size = eldqVar2.e.size();
                                ekzb[] ekzbVarArr = new ekzb[size];
                                arrayDeque.add(-1);
                                long j = 0;
                                while (!arrayDeque.isEmpty()) {
                                    Integer num = (Integer) arrayDeque.pop();
                                    int intValue = num.intValue();
                                    ArrayList arrayList = (ArrayList) hashMap.get(num);
                                    int size2 = arrayList.size();
                                    int i6 = 0;
                                    while (i6 < size2) {
                                        int i7 = i6;
                                        Integer num2 = (Integer) arrayList.get(i6);
                                        ekzb[] ekzbVarArr2 = ekzbVarArr;
                                        int intValue2 = num2.intValue();
                                        if (hashMap.containsKey(num2)) {
                                            arrayDeque.add(num2);
                                        }
                                        ekzx ekzxVar2 = (ekzx) eldqVar2.e.get(intValue2);
                                        int a = ekzdVar.a(ekzxVar2);
                                        HashMap hashMap2 = hashMap;
                                        ekzb ekzbVar = new ekzb(ekzxVar2.c, ekze.c(ekzxVar2), ekze.b(ekzxVar2), a, ekze.d(ekzxVar2, engwVar));
                                        ekzbVarArr2[intValue2] = ekzbVar;
                                        ArrayDeque arrayDeque2 = arrayDeque;
                                        if (intValue != -1) {
                                            ekzx ekzxVar3 = (ekzx) eldqVar2.e.get(intValue);
                                            long b = ekze.b(ekzxVar3);
                                            if (ekzdVar.a(ekzxVar3) == a) {
                                                i2 = size2;
                                                long j2 = ekzbVar.c;
                                                if (j2 <= b) {
                                                    i3 = intValue2;
                                                    long j3 = ekzbVar.b;
                                                    if (j3 == j2) {
                                                        ekzb ekzbVar2 = ekzbVarArr2[intValue];
                                                        if (j3 != ekzbVar2.b && j3 != ekzbVar2.c) {
                                                        }
                                                    }
                                                } else {
                                                    i3 = intValue2;
                                                }
                                            } else {
                                                i3 = intValue2;
                                                i2 = size2;
                                            }
                                            ekzbVarArr2[intValue].a(j);
                                            ekzbVarArr2[i3].a(j);
                                            j = 1 + j;
                                        } else {
                                            i2 = size2;
                                        }
                                        size2 = i2;
                                        i6 = i7 + 1;
                                        ekzbVarArr = ekzbVarArr2;
                                        arrayDeque = arrayDeque2;
                                        hashMap = hashMap2;
                                    }
                                }
                                ekzb[] ekzbVarArr3 = ekzbVarArr;
                                int i8 = 1;
                                for (int i9 = 1; i9 < ((enou) engwVar).c; i9++) {
                                    ekzbVarArr3[((Integer) engwVar.get(i9 - 1)).intValue()].c = ekzbVarArr3[((Integer) engwVar.get(i9)).intValue()].b;
                                }
                                eztz eztzVar = (eztz) ezua.a.createBuilder();
                                HashMap hashMap3 = new HashMap();
                                int i10 = 0;
                                while (true) {
                                    i = 2;
                                    if (i10 >= ekzdVar.a.e.size()) {
                                        break;
                                    }
                                    int a2 = ekzdVar.a((ekzx) ekzdVar.a.e.get(i10));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Span Track ");
                                    sb.append(a2 - 3);
                                    String sb2 = sb.toString();
                                    if (a2 == 2) {
                                        sb2 = "(0) Test Root Track";
                                    }
                                    if (a2 == 3) {
                                        sb2 = "(1) Root Track";
                                    }
                                    if (a2 == 1) {
                                        sb2 = "(2) Ui Thread Track";
                                    }
                                    hashMap3.put(Integer.valueOf(a2), sb2);
                                    i10++;
                                }
                                for (Integer num3 : hashMap3.keySet()) {
                                    int intValue3 = num3.intValue();
                                    ezuj ezujVar = (ezuj) ezuk.a.createBuilder();
                                    String str = (String) hashMap3.get(num3);
                                    ezujVar.copyOnWrite();
                                    ezuk ezukVar = (ezuk) ezujVar.instance;
                                    str.getClass();
                                    ezukVar.c = 2;
                                    ezukVar.d = str;
                                    ezujVar.copyOnWrite();
                                    ezuk ezukVar2 = (ezuk) ezujVar.instance;
                                    ezukVar2.b |= 1;
                                    ezukVar2.e = intValue3;
                                    ezub ezubVar = (ezub) ezuc.a.createBuilder();
                                    ezubVar.copyOnWrite();
                                    ezuc.a((ezuc) ezubVar.instance);
                                    ezuk ezukVar3 = (ezuk) ezujVar.build();
                                    ezubVar.copyOnWrite();
                                    ezuc ezucVar = (ezuc) ezubVar.instance;
                                    ezukVar3.getClass();
                                    ezucVar.d = ezukVar3;
                                    ezucVar.c = 60;
                                    ezuc ezucVar2 = (ezuc) ezubVar.build();
                                    eztzVar.copyOnWrite();
                                    ezua ezuaVar = (ezua) eztzVar.instance;
                                    ezucVar2.getClass();
                                    ezuaVar.a();
                                    ezuaVar.b.add(ezucVar2);
                                }
                                long a3 = ekze.a(eldqVar2.g, eldqVar2.h);
                                int i11 = 0;
                                while (i11 < size) {
                                    ekzb ekzbVar3 = ekzbVarArr3[i11];
                                    int i12 = ekzbVar3.d;
                                    ArrayList arrayList2 = new ArrayList(ekzbVar3.f.size());
                                    for (Long l : ekzbVar3.f) {
                                        int i13 = i;
                                        l.longValue();
                                        arrayList2.add(l);
                                        i = i13;
                                    }
                                    int i14 = i;
                                    ezul ezulVar = (ezul) ezun.a.createBuilder();
                                    String str2 = ekzbVar3.a;
                                    ezulVar.copyOnWrite();
                                    int i15 = i8;
                                    ezun ezunVar = (ezun) ezulVar.instance;
                                    str2.getClass();
                                    ezunVar.c = 23;
                                    ezunVar.d = str2;
                                    long j4 = a3;
                                    long j5 = i12;
                                    ezulVar.copyOnWrite();
                                    ezun ezunVar2 = (ezun) ezulVar.instance;
                                    ezunVar2.b |= 2;
                                    ezunVar2.g = j5;
                                    ezulVar.copyOnWrite();
                                    ezun ezunVar3 = (ezun) ezulVar.instance;
                                    eygl eyglVar = ezunVar3.h;
                                    if (!eyglVar.c()) {
                                        ezunVar3.h = eyfy.mutableCopy(eyglVar);
                                    }
                                    eydl.addAll(arrayList2, ezunVar3.h);
                                    String str3 = ekzbVar3.e;
                                    ezulVar.copyOnWrite();
                                    ezun ezunVar4 = (ezun) ezulVar.instance;
                                    eygr eygrVar = ezunVar4.e;
                                    if (!eygrVar.c()) {
                                        ezunVar4.e = eyfy.mutableCopy(eygrVar);
                                    }
                                    ezunVar4.e.add(str3);
                                    int i16 = i11;
                                    int i17 = size;
                                    if (ekzbVar3.c == ekzbVar3.b) {
                                        ezub ezubVar2 = (ezub) ezuc.a.createBuilder();
                                        ezubVar2.copyOnWrite();
                                        ezuc.a((ezuc) ezubVar2.instance);
                                        long j6 = j4 + ekzbVar3.b;
                                        ezubVar2.copyOnWrite();
                                        ezuc ezucVar3 = (ezuc) ezubVar2.instance;
                                        ezucVar3.b |= 1;
                                        ezucVar3.e = j6;
                                        ezulVar.copyOnWrite();
                                        ezun ezunVar5 = (ezun) ezulVar.instance;
                                        ezunVar5.f = 3;
                                        ezunVar5.b |= 1;
                                        ezun ezunVar6 = (ezun) ezulVar.build();
                                        ezubVar2.copyOnWrite();
                                        ezuc ezucVar4 = (ezuc) ezubVar2.instance;
                                        ezunVar6.getClass();
                                        ezucVar4.d = ezunVar6;
                                        ezucVar4.c = 11;
                                        s = engw.r((ezuc) ezubVar2.build());
                                    } else {
                                        ezub ezubVar3 = (ezub) ezuc.a.createBuilder();
                                        ezubVar3.copyOnWrite();
                                        ezuc.a((ezuc) ezubVar3.instance);
                                        long j7 = j4 + ekzbVar3.b;
                                        ezubVar3.copyOnWrite();
                                        ezuc ezucVar5 = (ezuc) ezubVar3.instance;
                                        ezucVar5.b |= 1;
                                        ezucVar5.e = j7;
                                        ezulVar.copyOnWrite();
                                        ezun ezunVar7 = (ezun) ezulVar.instance;
                                        ezunVar7.f = i15;
                                        ezunVar7.b |= i15;
                                        ezun ezunVar8 = (ezun) ezulVar.build();
                                        ezubVar3.copyOnWrite();
                                        ezuc ezucVar6 = (ezuc) ezubVar3.instance;
                                        ezunVar8.getClass();
                                        ezucVar6.d = ezunVar8;
                                        ezucVar6.c = 11;
                                        ezuc ezucVar7 = (ezuc) ezubVar3.build();
                                        ezub ezubVar4 = (ezub) ezuc.a.createBuilder();
                                        ezubVar4.copyOnWrite();
                                        ezuc.a((ezuc) ezubVar4.instance);
                                        long j8 = j4 + ekzbVar3.c;
                                        ezubVar4.copyOnWrite();
                                        ezuc ezucVar8 = (ezuc) ezubVar4.instance;
                                        ezucVar8.b |= 1;
                                        ezucVar8.e = j8;
                                        ezul ezulVar2 = (ezul) ezun.a.createBuilder();
                                        ezulVar2.copyOnWrite();
                                        ezun ezunVar9 = (ezun) ezulVar2.instance;
                                        ezunVar9.f = i14;
                                        i15 = 1;
                                        ezunVar9.b |= 1;
                                        ezulVar2.copyOnWrite();
                                        ezun ezunVar10 = (ezun) ezulVar2.instance;
                                        i14 = 2;
                                        ezunVar10.b |= 2;
                                        ezunVar10.g = j5;
                                        ezun ezunVar11 = (ezun) ezulVar2.build();
                                        ezubVar4.copyOnWrite();
                                        ezuc ezucVar9 = (ezuc) ezubVar4.instance;
                                        ezunVar11.getClass();
                                        ezucVar9.d = ezunVar11;
                                        ezucVar9.c = 11;
                                        s = engw.s(ezucVar7, (ezuc) ezubVar4.build());
                                    }
                                    eztzVar.copyOnWrite();
                                    ezua ezuaVar2 = (ezua) eztzVar.instance;
                                    ezuaVar2.a();
                                    eydl.addAll(s, ezuaVar2.b);
                                    i11 = i16 + 1;
                                    size = i17;
                                    i8 = i15;
                                    i = i14;
                                    a3 = j4;
                                }
                                ((ezua) eztzVar.build()).writeTo(fileOutputStream);
                                fileOutputStream.close();
                                Context context = elizVar2.b;
                                Uri a4 = FileProvider.a(context, String.valueOf(context.getPackageName()).concat(".DevToolsFileProvider"), file2);
                                Intent intent = new Intent();
                                intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                                intent.setAction("android.intent.action.SEND");
                                intent.putExtra("android.intent.extra.SUBJECT", "TikTok Trace: ".concat(String.valueOf(((ekzx) eldqVar2.e.get(0)).c)));
                                intent.putExtra("android.intent.extra.TEXT", "Drag or upload the proto into https://ui.perfetto.dev/\n\n");
                                intent.putExtra("android.intent.extra.STREAM", a4);
                                intent.setType("*/*");
                                elizVar2.b.startActivity(intent);
                                return null;
                            } finally {
                            }
                        }
                    }))), new ejlm(((ekzx) elioVar.j.e.get(0)).c), elioVar.l);
                    return true;
                }
            }));
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.eliv
    protected final /* synthetic */ fbae b() {
        return new ekku(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.eliv, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    Context context2 = (Context) ((akgt) aX).c.d.b();
                    ea eaVar = (ea) ((fbbb) ((akgt) aX).d).a;
                    ejwl ejwlVar = (ejwl) ((akgt) aX).k.b();
                    ejlq ejlqVar = (ejlq) ((akgt) aX).l.b();
                    Object b = ((akgt) aX).a.b.oI.b();
                    elbx elbxVar = (elbx) ((akgt) aX).a.aJ.b();
                    Bundle a = ((akgt) aX).a();
                    eyfc eyfcVar = (eyfc) ((akgt) aX).a.b.gz.b();
                    emxf.b(a.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                    elka elkaVar = (elka) ProtoParsers.f(a, "TIKTOK_FRAGMENT_ARGUMENT", elka.a, eyfcVar);
                    elkaVar.getClass();
                    this.a = new elio(context2, eaVar, ejwlVar, ejlqVar, (eljl) b, elbxVar, elkaVar, new eliz((Context) ((akgt) aX).a.q.b(), (errl) ((akgt) aX).a.t.b()));
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new fbal.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            elio H = H();
            H.c.k(H.l);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ag = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eliv, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
