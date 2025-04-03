package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.app.Person;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.textclassifier.ConversationAction;
import android.view.textclassifier.ConversationActions;
import android.view.textclassifier.TextClassifier;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;
import defpackage.cmh;
import defpackage.depm;
import defpackage.depq;
import defpackage.deps;
import defpackage.dept;
import defpackage.emwi;
import defpackage.emwj;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.engi;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhk;
import defpackage.enou;
import defpackage.enqv;
import defpackage.enyj;
import defpackage.erny;
import defpackage.erpp;
import defpackage.erqt;
import defpackage.erre;
import defpackage.errl;
import defpackage.ewun;
import defpackage.ewup;
import defpackage.ewuq;
import defpackage.ewur;
import defpackage.ewut;
import defpackage.ewuu;
import defpackage.ewvi;
import defpackage.ewvm;
import defpackage.ewvn;
import defpackage.ewvp;
import defpackage.ewvs;
import defpackage.ewvv;
import defpackage.ewvx;
import defpackage.ewvz;
import defpackage.ewwb;
import defpackage.ewwv;
import defpackage.ewww;
import defpackage.ewwx;
import defpackage.ewwz;
import defpackage.ewxa;
import defpackage.ewxc;
import defpackage.ewxd;
import defpackage.ewxg;
import defpackage.ewxk;
import defpackage.ewxm;
import defpackage.ewxn;
import defpackage.ewxp;
import defpackage.ewxq;
import defpackage.ewxr;
import defpackage.ewxs;
import defpackage.ewxt;
import defpackage.ewxx;
import defpackage.ewxy;
import defpackage.ewya;
import defpackage.ewyb;
import defpackage.ewyi;
import defpackage.ewyj;
import defpackage.ewym;
import defpackage.ewyp;
import defpackage.ewys;
import defpackage.ewyt;
import defpackage.ewyu;
import defpackage.ewyw;
import defpackage.ewyx;
import defpackage.ewyy;
import defpackage.ewzc;
import defpackage.ewzf;
import defpackage.ewzv;
import defpackage.ewzx;
import defpackage.ewzy;
import defpackage.exab;
import defpackage.exae;
import defpackage.exaf;
import defpackage.exag;
import defpackage.exal;
import defpackage.exap;
import defpackage.exaq;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygk;
import defpackage.eygu;
import defpackage.eyib;
import defpackage.fabu;
import defpackage.fabw;
import defpackage.fabz;
import defpackage.koa;
import defpackage.kqx;
import j$.time.TimeConversions;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TextClassifierLibImpl extends TextClassifierLib {
    private ewzy A;
    private boolean C;
    private boolean D;
    private final ewyi E;
    public final ListenableFuture c;
    public final exab d;
    public final ewwv e;
    public final ewxy f;
    public AnnotatorModel j;
    public GuardedNativeModels k;
    public ewut l;
    public DocumentsAnnotatorModel m;
    public LangIdModel n;
    public ewut o;
    public ActionsSuggestionsModel p;
    public ewut q;
    private final ewym t;
    private final Context u;
    private final ewyb v;
    private final ewyb w;
    private Date z;
    private static final boolean r = Log.isLoggable("TextClassifierLibImpl", 3);
    private static final long s = TimeUnit.HOURS.toMillis(1);
    public static final engw a = engw.x("address", "email", "phone", "url", "date", "datetime", "flight");
    public static final engw b = engw.C("view_calendar", "view_map", "track_flight", "open_url", "send_sms", "call_phone", "send_email", "text_reply", "create_reminder", "share_location", "add_contact", "copy", new String[0]);
    public final ReadWriteLock g = new ReentrantReadWriteLock();
    public final ReadWriteLock h = new ReentrantReadWriteLock();
    public final ReadWriteLock i = new ReentrantReadWriteLock();
    private final ReadWriteLock x = new ReentrantReadWriteLock();
    private final Object y = new Object();
    private final Object B = new Object();

    public TextClassifierLibImpl(Context context, exab exabVar, ewyi ewyiVar) {
        if (r) {
            int myPid = Process.myPid();
            Log.d("TextClassifierLibImpl", "Init in " + context.getPackageName() + " (PID " + myPid + ")");
        }
        context.getClass();
        this.u = context;
        this.d = exabVar;
        this.E = ewyiVar;
        ewym ewymVar = new ewym(new ewzv(this));
        this.t = ewymVar;
        ewyb ewyaVar = new ewya(new emwl() { // from class: ewzw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return TextClassifierLibImpl.this.j((exae) obj);
            }
        }, new emyl() { // from class: ewzh
            @Override // defpackage.emyl
            public final Object get() {
                TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                textClassifierLibImpl.h.readLock().lock();
                try {
                    LangIdModel langIdModel = textClassifierLibImpl.n;
                    return langIdModel == null ? emux.a : emxc.j(Float.valueOf(langIdModel.nativeGetLangIdThreshold(langIdModel.a)));
                } finally {
                    textClassifierLibImpl.h.readLock().unlock();
                }
            }
        }, new emyl() { // from class: ewzi
            @Override // defpackage.emyl
            public final Object get() {
                TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                textClassifierLibImpl.h.readLock().lock();
                try {
                    return emxc.i(textClassifierLibImpl.o);
                } finally {
                    textClassifierLibImpl.h.readLock().unlock();
                }
            }
        });
        this.v = ewyaVar;
        ewvx ewvxVar = (ewvx) exabVar;
        this.w = ewvxVar.c.isEmpty() ? ewyaVar : new ewyp(ewvxVar.c);
        this.e = new ewwv(context, ewvxVar.b);
        this.f = new ewxy();
        this.c = erny.f(ewymVar.a(), new emwl() { // from class: ewzj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return TextClassifierLibImpl.this;
            }
        }, erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ewxt m(AnnotatorModel.ClassificationResult classificationResult, int i, int i2) {
        char c;
        ewxg ewxgVar = new ewxg();
        ewxgVar.a = classificationResult.a;
        ewxgVar.b(classificationResult.b);
        ewxn ewxnVar = new ewxn();
        String str = classificationResult.a;
        int hashCode = str.hashCode();
        if (hashCode == -1298275357) {
            if (str.equals("entity")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 96801) {
            if (hashCode == 951526432 && str.equals("contact")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("app")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            byte[] bArr = classificationResult.d;
            String str2 = classificationResult.m;
            try {
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                ewvi ewviVar = (ewvi) eyfy.parseFrom(ewvi.a, bArr, eyfc.a);
                if (!ewviVar.e.isEmpty()) {
                    ewxnVar.a = ewviVar.e;
                }
                if (!ewviVar.f.isEmpty()) {
                    ewxnVar.b = ewviVar.f;
                }
                Iterator<E> it = ewviVar.g.iterator();
                while (it.hasNext()) {
                    ewxnVar.c((String) it.next());
                }
                int i3 = ewviVar.b;
                if ((i3 & 4) != 0 && (i3 & 8) != 0) {
                    ewxnVar.c = enyj.d(ewviVar.h, ewviVar.i);
                }
                if ((i3 & 16) != 0) {
                    ewxnVar.p = Float.valueOf(ewviVar.j);
                }
                if (ewviVar.d.isEmpty()) {
                    enqv it2 = exaq.a(ewviVar).iterator();
                    while (it2.hasNext()) {
                        depm depmVar = (depm) it2.next();
                        depq depqVar = depmVar.c;
                        if (depqVar == null) {
                            depqVar = depq.a;
                        }
                        dept deptVar = depqVar.f;
                        if (deptVar == null) {
                            deptVar = dept.a;
                        }
                        if (deps.a(deptVar.b) == 2) {
                            engr engrVar = new engr();
                            depq depqVar2 = depmVar.c;
                            if (depqVar2 == null) {
                                depqVar2 = depq.a;
                            }
                            ewxnVar.d(ewxq.a(depqVar2.c, Uri.parse(deptVar.b == 1 ? (String) deptVar.c : ""), engrVar, null));
                        }
                    }
                } else {
                    for (fabz fabzVar : ewviVar.d) {
                        int i4 = engw.d;
                        engr engrVar2 = new engr();
                        String str3 = fabzVar.c;
                        Uri parse = Uri.parse(fabzVar.d);
                        String str4 = fabzVar.f;
                        Iterator<E> it3 = new eygk(fabzVar.e, fabz.a).iterator();
                        while (it3.hasNext()) {
                            int i5 = ((fabw) it3.next()).o;
                            enhk enhkVar = ewxr.a;
                            Integer valueOf = Integer.valueOf(i5);
                            if (enhkVar.containsKey(valueOf)) {
                                engrVar2.h((ewxp) ewxr.a.get(valueOf));
                            } else {
                                engrVar2.h(ewxp.ACTION_UNSPECIFIED);
                            }
                        }
                        ewxnVar.d(ewxq.a(str3, parse, engrVar2, str4));
                    }
                }
                if (str2 != null && !str2.isEmpty()) {
                    ewxnVar.m = str2;
                }
                for (fabu fabuVar : ewviVar.k) {
                    ewxnVar.b(new ewxm(fabuVar.b, fabuVar.c, fabuVar.d, fabuVar.e));
                }
            } catch (eygu e) {
                throw new IllegalStateException("Invalid model data.", e);
            }
        } else if (c == 1) {
            String str5 = classificationResult.e;
            if (str5 != null) {
                ewxnVar.d = str5;
            }
            String str6 = classificationResult.f;
            if (str6 != null) {
                ewxnVar.e = str6;
            }
            String str7 = classificationResult.g;
            if (str7 != null) {
                ewxnVar.f = str7;
            }
            String str8 = classificationResult.h;
            if (str8 != null) {
                ewxnVar.g = str8;
            }
            String str9 = classificationResult.i;
            if (str9 != null) {
                ewxnVar.h = str9;
            }
            String str10 = classificationResult.j;
            if (str10 != null) {
                ewxnVar.i = str10;
            }
            String str11 = classificationResult.k;
            if (str11 != null) {
                ewxnVar.j = str11;
            }
            String str12 = classificationResult.l;
            if (str12 != null) {
                ewxnVar.k = str12;
            }
            String str13 = classificationResult.m;
            if (str13 != null) {
                ewxnVar.m = str13;
            }
        } else if (c == 2) {
            String str14 = classificationResult.n;
            if (str14 != null) {
                ewxnVar.n = str14;
            }
            String str15 = classificationResult.o;
            if (str15 != null) {
                ewxnVar.o = str15;
            }
        }
        Bundle bundle = new Bundle();
        ewxs a2 = ewxnVar.a();
        bundle.putString("textclassifier.extras.KG_MID", a2.a);
        bundle.putString("textclassifier.extras.KG_TITLE", a2.b);
        bundle.putStringArrayList("textclassifier.extras.KG_COLLECTION_HRIDS", new ArrayList<>(a2.c));
        bundle.putSerializable("textclassifier.extras.KG_LAT_LNG", a2.d);
        bundle.putParcelableArrayList("textclassifier.extras.KG_DEEPLINKS", new ArrayList<>(a2.e));
        bundle.putString("textclassifier.extras.CONTACT_NAME", a2.f);
        bundle.putString("textclassifier.extras.CONTACT_GIVEN_NAME", a2.g);
        bundle.putString("textclassifier.extras.CONTACT_FAMILY_NAME", a2.h);
        bundle.putString("textclassifier.extras.CONTACT_NICKNAME", a2.i);
        bundle.putString("textclassifier.extras.CONTACT_EMAIL_ADDRESS", a2.j);
        bundle.putString("textclassifier.extras.CONTACT_PHONE_NUMBER", a2.k);
        bundle.putString("textclassifier.extras.CONTACT_ACCOUNT_TYPE", a2.l);
        bundle.putString("textclassifier.extras.CONTACT_ACCOUNT_NAME", a2.m);
        bundle.putString("textclassifier.extras.CONTACT_ID", a2.o);
        bundle.putString("textclassifier.extras.CONTACT_ALTERNATE_NAME", a2.n);
        bundle.putString("textclassifier.extras.APP_NAME", a2.p);
        bundle.putString("textclassifier.extras.APP_PACKAGE_NAME", a2.q);
        Float f = a2.r;
        if (f != null) {
            bundle.putFloat("textclassifier.extras.KG_TOPICALITY_SCORE", f.floatValue());
        }
        engi engiVar = a2.s;
        if (engiVar != null && !engiVar.isEmpty()) {
            bundle.putParcelableArrayList("textclassifier.extras.BROADER_USER_INTERESTS", new ArrayList<>(a2.s));
        }
        ewxgVar.h = bundle;
        ewxgVar.i = i;
        ewxgVar.j = i2;
        if (classificationResult.a.equals("date") || classificationResult.a.equals("datetime")) {
            ewxgVar.b = Long.valueOf(classificationResult.c.a);
            ewxgVar.c = ewxk.a(classificationResult.c.b);
        }
        if (classificationResult.a.equals("number") || classificationResult.a.equals("percentage")) {
            ewxgVar.d = Long.valueOf(classificationResult.s);
            ewxgVar.e = Double.valueOf(classificationResult.t);
        }
        if (classificationResult.a.equals("duration")) {
            ewxgVar.f = Long.valueOf(classificationResult.r);
        }
        byte[] bArr2 = classificationResult.p;
        if (bArr2 != null) {
            ewxgVar.g = (byte[]) bArr2.clone();
        }
        return ewxgVar.a();
    }

    private static String n(kqx kqxVar) {
        return kqxVar == null ? "" : kqxVar.e();
    }

    private final void o() {
        Date date = new Date();
        synchronized (this.y) {
            boolean z = false;
            if (this.z != null && date.getTime() < this.z.getTime() + s) {
                z = true;
            }
            ewvv ewvvVar = new ewvv(koa.c(this.E.a, "android.permission.READ_CONTACTS"));
            if (z && ewvvVar.equals(this.A)) {
                Log.d("TextClassifierLibImpl", "Skipping async model load. Loaded recently, no change to permissions.");
                return;
            }
            this.z = date;
            this.A = ewvvVar;
            final ListenableFuture a2 = this.t.a();
            a2.b(new Runnable() { // from class: ewyk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ListenableFuture.this.get();
                    } catch (Throwable th) {
                        Log.w("TCRefreshRunner", "Refresh run failed.", th);
                    }
                }
            }, erpp.a);
        }
    }

    @Override // defpackage.ewzc
    public final ewyx a(ewyw ewywVar) {
        return i(new ewys(ewywVar));
    }

    @Override // defpackage.ewzc
    public final exap b(exal exalVar) {
        enhk enhkVar = ewyu.a;
        return g(ewyt.a(null, null, exalVar));
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final ListenableFuture d() {
        if (r) {
            Log.d("TextClassifierLibImpl", "close() in PID " + Process.myPid());
        }
        synchronized (this.B) {
            emxf.l(!this.C);
            this.C = true;
        }
        return erny.f(this.t.a(), new emwl() { // from class: ewzn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = TextClassifierLibImpl.a;
                return null;
            }
        }, erpp.a);
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final ListenableFuture e() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final ewxd f(ewxc ewxcVar) {
        ConversationActions.Request.Builder hints;
        ConversationActions.Request.Builder extras;
        ConversationActions.Request.Builder typeConfig;
        ConversationActions.Request build;
        ConversationActions suggestConversationActions;
        List conversationActions;
        String id;
        RemoteActionCompat remoteActionCompat;
        ActionsSuggestionsModel.ConversationMessage[] conversationMessageArr;
        int intValue;
        ewxd a2;
        int i;
        Collection collection;
        RemoteActionCompat remoteActionCompat2;
        ewup b2;
        if (r) {
            Log.d("TextClassifierLibImpl", "suggestConversationActions in PID " + Process.myPid());
        }
        try {
            this.c.get();
            o();
            this.g.readLock().lock();
            this.i.readLock().lock();
            try {
                if (this.p == null) {
                    int i2 = engw.d;
                    a2 = ewxd.d(enou.a).a();
                } else {
                    List<ewxa> list = ewxcVar.a;
                    ewyb ewybVar = this.w;
                    ArrayList arrayList = new ArrayList();
                    for (ewxa ewxaVar : list) {
                        if (!TextUtils.isEmpty(ewxaVar.d)) {
                            arrayList.add(ewxaVar);
                        }
                    }
                    int i3 = 0;
                    if (arrayList.isEmpty()) {
                        conversationMessageArr = new ActionsSuggestionsModel.ConversationMessage[0];
                        remoteActionCompat = null;
                    } else {
                        ArrayDeque arrayDeque = new ArrayDeque();
                        emwj emwjVar = ewvm.a;
                        cmh cmhVar = new cmh();
                        int i4 = 1;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ewxa ewxaVar2 = (ewxa) arrayList.get(size);
                            emwi emwiVar = new emwi(ewvm.a, ewxaVar2.c);
                            if (ewvm.b.equals(emwiVar)) {
                                intValue = 0;
                            } else {
                                Integer num = (Integer) cmhVar.get(emwiVar);
                                if (num == null) {
                                    num = Integer.valueOf(i4);
                                    cmhVar.put(emwiVar, num);
                                    i4++;
                                }
                                intValue = num.intValue();
                            }
                            arrayDeque.push(new ActionsSuggestionsModel.ConversationMessage(intValue, ewxaVar2.d.toString(), TimeZone.getDefault().getID(), ewybVar.b(ewxaVar2.d)));
                        }
                        remoteActionCompat = null;
                        conversationMessageArr = (ActionsSuggestionsModel.ConversationMessage[]) arrayDeque.toArray(new ActionsSuggestionsModel.ConversationMessage[arrayDeque.size()]);
                    }
                    if (conversationMessageArr.length == 0) {
                        int i5 = engw.d;
                        a2 = ewxd.d(enou.a).a();
                    } else {
                        ActionsSuggestionsModel.Conversation conversation = new ActionsSuggestionsModel.Conversation(conversationMessageArr);
                        ActionsSuggestionsModel actionsSuggestionsModel = this.p;
                        Context context = this.u;
                        String a3 = ewun.a(context);
                        AnnotatorModel annotatorModel = this.j;
                        ActionsSuggestionsModel.ActionSuggestions nativeSuggestActions = actionsSuggestionsModel.nativeSuggestActions(actionsSuggestionsModel.a, conversation, null, annotatorModel != null ? annotatorModel.a() : 0L, context, a3, true);
                        Collection b3 = ewxcVar.b.b(b);
                        ArrayList<ewwx> arrayList2 = new ArrayList();
                        ActionsSuggestionsModel.ActionSuggestion[] actionSuggestionArr = nativeSuggestActions.a;
                        int length = actionSuggestionArr.length;
                        int i6 = 0;
                        while (i6 < length) {
                            ActionsSuggestionsModel.ActionSuggestion actionSuggestion = actionSuggestionArr[i6];
                            String str = actionSuggestion.b;
                            if (b3.contains(str)) {
                                ArrayList arrayList3 = new ArrayList();
                                ActionsSuggestionsModel.Slot[] slotArr = actionSuggestion.g;
                                if (slotArr != null) {
                                    int length2 = slotArr.length;
                                    int i7 = i3;
                                    while (i7 < length2) {
                                        ActionsSuggestionsModel.Slot slot = slotArr[i7];
                                        arrayList3.add(new ewvs(slot.a, slot.b, slot.c, slot.d, slot.e));
                                        i7++;
                                        b3 = b3;
                                    }
                                }
                                collection = b3;
                                str.getClass();
                                float f = actionSuggestion.c;
                                String str2 = actionSuggestion.a;
                                engw n = engw.n(arrayList3);
                                Bundle bundle = new Bundle();
                                RemoteActionTemplate[] remoteActionTemplateArr = actionSuggestion.f;
                                engw b4 = remoteActionTemplateArr == null ? enou.a : ewur.b(remoteActionTemplateArr);
                                if (b4.isEmpty() || (b2 = ((ewuq) b4.get(0)).b(this.u)) == null) {
                                    remoteActionCompat2 = remoteActionCompat;
                                } else {
                                    remoteActionCompat2 = b2.b;
                                    bundle.putParcelable("action-intent", b2.a);
                                }
                                bundle.putByteArray("serialized-entities-data", actionSuggestion.e);
                                bundle.putParcelable("entities-extras", ewur.a(actionSuggestion.d));
                                arrayList2.add(ewww.a(remoteActionCompat2, str2, bundle, n));
                            } else {
                                collection = b3;
                            }
                            i6++;
                            b3 = collection;
                            i3 = 0;
                        }
                        int i8 = 1;
                        cmh cmhVar2 = new cmh();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Pair a4 = ewvn.a((ewwx) it.next());
                            if (a4 != null) {
                                cmhVar2.put(a4, Integer.valueOf((cmhVar2.containsKey(a4) ? ((Integer) cmhVar2.get(a4)).intValue() : 0) + 1));
                            }
                        }
                        List arrayList4 = new ArrayList();
                        for (ewwx ewwxVar : arrayList2) {
                            Pair a5 = ewvn.a(ewwxVar);
                            i8 = (a5 == null || ((Integer) cmhVar2.get(a5)).intValue() == (i = i8)) ? 1 : i;
                            arrayList4.add(ewwxVar);
                        }
                        if (arrayList4.size() > 4) {
                            arrayList4 = arrayList4.subList(0, 4);
                        }
                        Context context2 = this.u;
                        List<ewxa> list2 = ewxcVar.a;
                        emxc i9 = emxc.i(this.q);
                        emxc i10 = emxc.i(this.l);
                        emxc a6 = this.w.a();
                        int i11 = engw.d;
                        engr engrVar = new engr();
                        for (ewxa ewxaVar3 : list2) {
                            engrVar.h(Integer.valueOf(Arrays.hashCode(new Object[]{ewxaVar3.c, ewxaVar3.d, remoteActionCompat})));
                        }
                        String a7 = ewuu.a(Arrays.hashCode(new Object[]{engrVar, context2.getPackageName()}), engw.t(i9, i10, a6));
                        ewwz d = ewxd.d(arrayList4);
                        ((ewvp) d).b = a7;
                        d.b(nativeSuggestActions.b);
                        a2 = d.a();
                    }
                }
                return a2;
            } finally {
                this.g.readLock().unlock();
                this.i.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((ewvx) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            ewzc ewzcVar = ewyy.a(this.u).a;
            ewyj.c();
            if (Build.VERSION.SDK_INT < 29) {
                ewzc.c();
                int i12 = engw.d;
                return ewxd.d(enou.a).a();
            }
            TextClassifier textClassifier = ((ewyj) ewzcVar).a;
            hints = new ConversationActions.Request.Builder((List) Collection.EL.stream(ewxcVar.a).map(new Function() { // from class: ewxb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Person.Builder name;
                    Person.Builder icon;
                    Person.Builder uri;
                    Person.Builder key;
                    Person.Builder bot;
                    Person.Builder important;
                    Person build2;
                    ConversationActions.Message.Builder text;
                    ConversationActions.Message.Builder referenceTime;
                    ConversationActions.Message.Builder extras2;
                    ConversationActions.Message build3;
                    ewxa ewxaVar4 = (ewxa) obj;
                    knr knrVar = ewxaVar4.c;
                    name = new Person.Builder().setName(knrVar.a);
                    IconCompat iconCompat = knrVar.b;
                    icon = name.setIcon(iconCompat != null ? iconCompat.c() : null);
                    uri = icon.setUri(knrVar.c);
                    key = uri.setKey(knrVar.d);
                    bot = key.setBot(knrVar.e);
                    important = bot.setImportant(knrVar.f);
                    build2 = important.build();
                    text = new ConversationActions.Message.Builder(build2).setText(ewxaVar4.d);
                    referenceTime = text.setReferenceTime(TimeConversions.convert((ZonedDateTime) null));
                    extras2 = referenceTime.setExtras(ewxaVar4.e);
                    build3 = extras2.build();
                    return build3;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())).setHints(ewxcVar.c);
            extras = hints.setExtras(ewxcVar.d);
            typeConfig = extras.setTypeConfig(ewxcVar.b.a());
            typeConfig.setMaxSuggestions(4);
            build = typeConfig.build();
            suggestConversationActions = textClassifier.suggestConversationActions(build);
            if (suggestConversationActions == null) {
                return null;
            }
            conversationActions = suggestConversationActions.getConversationActions();
            ewwz d2 = ewxd.d((List) Collection.EL.stream(conversationActions).map(new Function() { // from class: ewwy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String type;
                    RemoteAction action;
                    RemoteAction action2;
                    RemoteActionCompat a8;
                    CharSequence textReply;
                    Bundle extras2;
                    ConversationAction m390m = hwu$$ExternalSyntheticApiModelOutline0.m390m(obj);
                    if (m390m == null) {
                        return null;
                    }
                    type = m390m.getType();
                    type.getClass();
                    action = m390m.getAction();
                    if (action == null) {
                        a8 = null;
                    } else {
                        action2 = m390m.getAction();
                        a8 = RemoteActionCompat.a(action2);
                    }
                    m390m.getConfidenceScore();
                    textReply = m390m.getTextReply();
                    extras2 = m390m.getExtras();
                    return ewww.a(a8, textReply, extras2, null);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()));
            id = suggestConversationActions.getId();
            ((ewvp) d2).b = id;
            return d2.a();
        }
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public final exap g(ewyu ewyuVar) {
        Bundle deepCopy;
        Bundle deepCopy2;
        int i;
        if (r) {
            Log.d("TextClassifierLibImpl", "generateLinks in PID " + Process.myPid());
        }
        try {
            this.c.get();
            o();
            String charSequence = ewyuVar.b.a.toString();
            String n = n(null);
            charSequence.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList<List> arrayList2 = new ArrayList();
            java.util.Collection b2 = ewyuVar.b.b.b(a);
            this.g.readLock().lock();
            try {
                if (this.j != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String id = TimeZone.getDefault().getID();
                    AnnotatorModel annotatorModel = this.j;
                    String b3 = this.v.b(charSequence);
                    enhk enhkVar = ewyu.a;
                    deepCopy2 = ewyuVar.b.c.deepCopy();
                    AnnotatorModel.AnnotatedSpan[] nativeAnnotate = annotatorModel.nativeAnnotate(annotatorModel.a, charSequence, new AnnotatorModel.AnnotationOptions(currentTimeMillis, id, n, b3, b2, ((ewzf) enhkVar.getOrDefault(Integer.valueOf(deepCopy2.getInt("textclassifier.extras.ANNOTATION_USECASE")), ewzf.SMART)).c));
                    if (nativeAnnotate == null) {
                        Log.e("TextClassifierLibImpl", "[generateLinks] nativeClassifier.annotate returns null!");
                    } else {
                        int length = nativeAnnotate.length;
                        int i2 = 0;
                        while (i2 < length) {
                            AnnotatorModel.AnnotatedSpan annotatedSpan = nativeAnnotate[i2];
                            cmh cmhVar = new cmh();
                            AnnotatorModel.ClassificationResult[] classificationResultArr = annotatedSpan.c;
                            int length2 = classificationResultArr.length;
                            if (length2 == 0) {
                                i = length;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                int i3 = 0;
                                while (i3 < length2) {
                                    AnnotatorModel.ClassificationResult classificationResult = classificationResultArr[i3];
                                    cmhVar.put(classificationResult.a, Float.valueOf(classificationResult.b));
                                    arrayList3.add(m(classificationResult, annotatedSpan.a, annotatedSpan.b));
                                    i3++;
                                    length = length;
                                }
                                i = length;
                                exag.b(annotatedSpan.a, annotatedSpan.b, cmhVar, arrayList);
                                arrayList2.add(arrayList3);
                            }
                            i2++;
                            length = i;
                        }
                    }
                }
                if (this.j == null && ((ewvx) this.d).a) {
                    this.g.readLock().unlock();
                    return ewyy.a(this.u).a.b(ewyuVar.b);
                }
                ArrayList<Bundle> arrayList4 = new ArrayList();
                for (List list : arrayList2) {
                    Bundle bundle = new Bundle();
                    ewxx.a(list, bundle);
                    arrayList4.add(bundle);
                }
                Bundle bundle2 = new Bundle();
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                for (Bundle bundle3 : arrayList4) {
                    bundle3.getClass();
                    deepCopy = bundle3.deepCopy();
                    arrayList5.add(deepCopy);
                }
                bundle2.putParcelableArrayList("gms.textclassifier.text_link_extras", arrayList5);
                return exag.a(charSequence, arrayList, bundle2);
            } finally {
                this.g.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((ewvx) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            return ewyy.a(this.u).a.b(ewyuVar.b);
        }
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public long getNativeGuardedNativeModelsPointer() {
        return this.k.a();
    }

    public final ListenableFuture h(errl errlVar) {
        synchronized (this.B) {
            if (this.D) {
                return erqt.i(ewzx.a);
            }
            if (this.C) {
                this.D = true;
                return errlVar.submit(new Callable() { // from class: ewzg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eoel eoelVar = new eoel();
                        final TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                        eoelVar.a(new Closeable() { // from class: ewzk
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                TextClassifierLibImpl.this.l();
                            }
                        });
                        eoelVar.a(new Closeable() { // from class: ewzl
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                TextClassifierLibImpl textClassifierLibImpl2 = TextClassifierLibImpl.this;
                                textClassifierLibImpl2.h.writeLock().lock();
                                try {
                                    LangIdModel langIdModel = textClassifierLibImpl2.n;
                                    if (langIdModel != null) {
                                        langIdModel.close();
                                        textClassifierLibImpl2.n = null;
                                        textClassifierLibImpl2.o = null;
                                    }
                                } finally {
                                    textClassifierLibImpl2.h.writeLock().unlock();
                                }
                            }
                        });
                        eoelVar.a(new Closeable() { // from class: ewzm
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                TextClassifierLibImpl.this.k();
                            }
                        });
                        eoelVar.a(textClassifierLibImpl.k);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).d);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).e);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).f);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).g);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).h);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).i);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).j);
                        eoelVar.a(textClassifierLibImpl.e);
                        eoelVar.a(textClassifierLibImpl.m);
                        eoelVar.a(((ewvx) textClassifierLibImpl.d).k);
                        eoelVar.close();
                        return ewzx.a;
                    }
                });
            }
            synchronized (this.y) {
                this.z = new Date();
            }
            if (this.k == null) {
                try {
                    this.k = new GuardedNativeModels();
                } catch (UnsatisfiedLinkError e) {
                    return erqt.h(e);
                }
            }
            this.x.writeLock().lock();
            try {
                try {
                    if (this.m == null) {
                        this.m = new DocumentsAnnotatorModel();
                    }
                    this.x.writeLock().unlock();
                    ListenableFuture listenableFuture = erre.a;
                    final ewwv ewwvVar = this.e;
                    ewwvVar.getClass();
                    this.f.getClass();
                    ListenableFuture f = erny.f(erqt.f(listenableFuture, listenableFuture, listenableFuture, listenableFuture, errlVar.submit(new Callable() { // from class: ewzo
                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Code restructure failed: missing block: B:100:0x028a, code lost:
                        
                            r6.close();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:101:0x02a2, code lost:
                        
                            r4.copyOnWrite();
                            r0 = (defpackage.ewuy) r4.instance;
                            r5.getClass();
                            r0.b |= 128;
                            r0.k = r5;
                            r0 = (defpackage.ewuy) r4.build();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:102:0x02c0, code lost:
                        
                            if (r0.equals(r2.c) == false) goto L108;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:103:0x02c2, code lost:
                        
                            r2.c = r0;
                            r2.d = r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:104:0x02c6, code lost:
                        
                            return r17;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
                        
                            return r17;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:107:0x028e, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:108:0x028f, code lost:
                        
                            r7 = r5;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:110:0x0291, code lost:
                        
                            r6.close();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
                        
                            throw r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:113:0x029a, code lost:
                        
                            r5 = r7;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:114:0x029b, code lost:
                        
                            android.util.Log.w("ContactModelManager", "Could not load lightweighTokens model.");
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:115:0x0295, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:116:0x0296, code lost:
                        
                            r0.addSuppressed(r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:117:0x0299, code lost:
                        
                            throw r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:120:0x00fa, code lost:
                        
                            r8.close();
                            r3 = r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:124:0x00f8, code lost:
                        
                            if (r8 == null) goto L67;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
                        
                            if (r8 == null) goto L67;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
                        
                            r0 = new java.util.ArrayList();
                            r5 = r11.iterator();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
                        
                            if (r5.hasNext() == false) goto L145;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
                        
                            r6 = (java.lang.String) r5.next();
                            r10 = (defpackage.ewuw) defpackage.ewux.a.createBuilder();
                            r10.getClass();
                            defpackage.ewwu.a(r6, r3, new defpackage.ewwi(), r9);
                            defpackage.ewwu.a(r6, 2, new defpackage.ewwj(), r9);
                            defpackage.ewwu.a(r6, 3, new defpackage.ewwk(), r9);
                            defpackage.ewwu.a(r6, 4, new defpackage.ewwl(), r9);
                            defpackage.ewwu.a(r6, 5, new defpackage.ewwm(), r9);
                            defpackage.ewwu.a(r6, 6, new defpackage.ewwn(), r9);
                            defpackage.ewwu.a(r6, 7, new defpackage.ewwo(), r9);
                            defpackage.ewwu.a(r6, 8, new defpackage.ewwp(), r9);
                            defpackage.ewwu.a(r6, 9, new defpackage.ewwq(), r9);
                            defpackage.ewwu.a(r6, 10, new defpackage.ewwr(), r9);
                            r10.copyOnWrite();
                            r7 = (defpackage.ewux) r10.instance;
                            r6.getClass();
                            r7.b |= 512;
                            r7.l = r6;
                            r0.add((defpackage.ewux) r10.build());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:67:0x01b3, code lost:
                        
                            r0 = r0.iterator();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:69:0x01bb, code lost:
                        
                            if (r0.hasNext() == false) goto L146;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:70:0x01bd, code lost:
                        
                            r5 = (defpackage.ewux) r0.next();
                            r4.copyOnWrite();
                            r6 = (defpackage.ewuy) r4.instance;
                            r5.getClass();
                            r9 = r6.c;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:71:0x01d3, code lost:
                        
                            if (r9.c() != false) goto L148;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:72:0x01d5, code lost:
                        
                            r6.c = defpackage.eyfy.mutableCopy(r9);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:74:0x01db, code lost:
                        
                            r6.c.add(r5);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:77:0x01e1, code lost:
                        
                            r4.copyOnWrite();
                            r0 = (defpackage.ewuy) r4.instance;
                            r0.b |= r3;
                            r0.d = 4;
                            r4.copyOnWrite();
                            r0 = (defpackage.ewuy) r4.instance;
                            r0.b |= 2;
                            r0.e = 20;
                            r0 = r2.b;
                            r4.copyOnWrite();
                            r5 = (defpackage.ewuy) r4.instance;
                            r5.b |= 4;
                            r5.f = ((defpackage.ewvu) r0).a;
                            r0 = r2.b;
                            r4.copyOnWrite();
                            r5 = (defpackage.ewuy) r4.instance;
                            r5.b |= 8;
                            r5.g = ((defpackage.ewvu) r0).b;
                            r4.copyOnWrite();
                            r0 = (defpackage.ewuy) r4.instance;
                            r0.b |= 16;
                            r0.h = false;
                            r0 = r2.b;
                            r4.copyOnWrite();
                            r5 = (defpackage.ewuy) r4.instance;
                            r5.b |= 32;
                            r5.i = ((defpackage.ewvu) r0).c;
                            r4.copyOnWrite();
                            r0 = (defpackage.ewuy) r4.instance;
                            r0.b |= 64;
                            r0.j = false;
                            r5 = defpackage.eyee.b;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:79:0x025c, code lost:
                        
                            r6 = ((defpackage.ewvu) r2.b).d.a();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:81:0x0266, code lost:
                        
                            r0 = ((defpackage.ewvr) r6).b;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:82:0x026b, code lost:
                        
                            if (r0 == null) goto L95;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:83:0x026d, code lost:
                        
                            r7 = ((defpackage.ewwg) r0).createInputStream();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:85:0x0273, code lost:
                        
                            r5 = defpackage.eyee.B(r7);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:86:0x0277, code lost:
                        
                            if (r7 == null) goto L95;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:87:0x0279, code lost:
                        
                            r7.close();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:89:0x027d, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Not initialized variable reg: 8, insn: 0x02c8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:713), block:B:144:0x02c8 */
                        /* JADX WARN: Type inference failed for: r3v11 */
                        /* JADX WARN: Type inference failed for: r3v12 */
                        /* JADX WARN: Type inference failed for: r3v13 */
                        /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 738
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ewzo.call():java.lang.Object");
                        }
                    }), errlVar.submit(new Callable() { // from class: ewzp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    })), new emwl() { // from class: ewzq
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ewyh ewyhVar;
                            Throwable th;
                            ewyh ewyhVar2;
                            Throwable th2;
                            Throwable th3;
                            Throwable th4;
                            Throwable th5;
                            ewvg ewvgVar;
                            TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                            try {
                                ewyh a2 = ((ewvx) textClassifierLibImpl.d).d.a();
                                try {
                                    try {
                                        ewyh a3 = ((ewvx) textClassifierLibImpl.d).g.a();
                                        try {
                                            try {
                                                ewyh a4 = ((ewvx) textClassifierLibImpl.d).i.a();
                                                try {
                                                    try {
                                                        ewyh a5 = ((ewvx) textClassifierLibImpl.d).j.a();
                                                        try {
                                                            try {
                                                                ewyh a6 = ((ewvx) textClassifierLibImpl.d).h.a();
                                                                try {
                                                                    if (!((ewvr) a2).a) {
                                                                        try {
                                                                            if (!((ewvr) a3).a && !((ewvr) a6).a) {
                                                                                ewwv ewwvVar2 = textClassifierLibImpl.e;
                                                                                boolean z = ewwvVar2.d;
                                                                                ewwvVar2.d = false;
                                                                                if (!z) {
                                                                                    ewxy ewxyVar = textClassifierLibImpl.f;
                                                                                    boolean z2 = ewxyVar.b;
                                                                                    ewxyVar.b = false;
                                                                                    if (!z2 && !((ewvr) a4).a && !((ewvr) a5).a) {
                                                                                        Log.d("TextClassifierLibImpl", "Skipping asynchronous annotator reload. No model change.");
                                                                                        ewyhVar = a2;
                                                                                        ewyhVar2 = a3;
                                                                                        a6.close();
                                                                                        a5.close();
                                                                                        a4.close();
                                                                                        ewyhVar2.close();
                                                                                        ewyhVar.close();
                                                                                        return ewzx.a;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th5 = th6;
                                                                            ewyhVar = a2;
                                                                            ewyhVar2 = a3;
                                                                            try {
                                                                                a6.close();
                                                                                throw th5;
                                                                            } catch (Throwable th7) {
                                                                                th5.addSuppressed(th7);
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    }
                                                                    AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) ((ewvr) a2).b;
                                                                    exau exauVar = (exau) ((ewvr) a3).b;
                                                                    AssetFileDescriptor assetFileDescriptor2 = (AssetFileDescriptor) ((ewvr) a6).b;
                                                                    ewuy ewuyVar = textClassifierLibImpl.e.c;
                                                                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ((ewvr) a4).b;
                                                                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ((ewvr) a5).b;
                                                                    ewvc ewvcVar = textClassifierLibImpl.f.a;
                                                                    if (exauVar == null) {
                                                                        ewvgVar = null;
                                                                        ewyhVar = a2;
                                                                        ewyhVar2 = a3;
                                                                    } else {
                                                                        ewvd ewvdVar = (ewvd) ewvg.a.createBuilder();
                                                                        engw e2 = exauVar.e();
                                                                        int i = ((enou) e2).c;
                                                                        int i2 = 0;
                                                                        while (i2 < i) {
                                                                            exat exatVar = (exat) e2.get(i2);
                                                                            int i3 = i;
                                                                            ewve ewveVar = (ewve) ewvf.a.createBuilder();
                                                                            int i4 = i2;
                                                                            String e3 = exatVar.e();
                                                                            ewveVar.copyOnWrite();
                                                                            ewyhVar = a2;
                                                                            try {
                                                                                ewvf ewvfVar = (ewvf) ewveVar.instance;
                                                                                ewyhVar2 = a3;
                                                                                try {
                                                                                    ewvfVar.b |= 1;
                                                                                    ewvfVar.c = e3;
                                                                                    String b2 = exaq.b(exatVar.c());
                                                                                    ewveVar.copyOnWrite();
                                                                                    ewvf ewvfVar2 = (ewvf) ewveVar.instance;
                                                                                    b2.getClass();
                                                                                    ewvfVar2.b |= 2;
                                                                                    ewvfVar2.d = b2;
                                                                                    String b3 = exaq.b(exatVar.a());
                                                                                    ewveVar.copyOnWrite();
                                                                                    ewvf ewvfVar3 = (ewvf) ewveVar.instance;
                                                                                    b3.getClass();
                                                                                    ewvfVar3.b |= 4;
                                                                                    ewvfVar3.e = b3;
                                                                                    if (exatVar.b() != null) {
                                                                                        String b4 = exaq.b(exatVar.b());
                                                                                        ewveVar.copyOnWrite();
                                                                                        ewvf ewvfVar4 = (ewvf) ewveVar.instance;
                                                                                        b4.getClass();
                                                                                        ewvfVar4.b |= 8;
                                                                                        ewvfVar4.f = b4;
                                                                                    }
                                                                                    if (exatVar.d() != null) {
                                                                                        String b5 = exaq.b(exatVar.d());
                                                                                        ewveVar.copyOnWrite();
                                                                                        ewvf ewvfVar5 = (ewvf) ewveVar.instance;
                                                                                        b5.getClass();
                                                                                        ewvfVar5.b |= 16;
                                                                                        ewvfVar5.g = b5;
                                                                                    }
                                                                                    ewvf ewvfVar6 = (ewvf) ewveVar.build();
                                                                                    ewvdVar.copyOnWrite();
                                                                                    ewvg ewvgVar2 = (ewvg) ewvdVar.instance;
                                                                                    ewvfVar6.getClass();
                                                                                    eygr eygrVar = ewvgVar2.c;
                                                                                    if (!eygrVar.c()) {
                                                                                        ewvgVar2.c = eyfy.mutableCopy(eygrVar);
                                                                                    }
                                                                                    ewvgVar2.c.add(ewvfVar6);
                                                                                    i2 = i4 + 1;
                                                                                    i = i3;
                                                                                    a2 = ewyhVar;
                                                                                    a3 = ewyhVar2;
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    th5 = th;
                                                                                    a6.close();
                                                                                    throw th5;
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                ewyhVar2 = a3;
                                                                                th5 = th;
                                                                                a6.close();
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                        ewyhVar = a2;
                                                                        ewyhVar2 = a3;
                                                                        if (exauVar.a() != null) {
                                                                            String b6 = exaq.b(exauVar.a());
                                                                            ewvdVar.copyOnWrite();
                                                                            ewvg ewvgVar3 = (ewvg) ewvdVar.instance;
                                                                            b6.getClass();
                                                                            ewvgVar3.b |= 1;
                                                                            ewvgVar3.d = b6;
                                                                        }
                                                                        if (exauVar.d() != null) {
                                                                            String b7 = exaq.b(exauVar.d());
                                                                            ewvdVar.copyOnWrite();
                                                                            ewvg ewvgVar4 = (ewvg) ewvdVar.instance;
                                                                            b7.getClass();
                                                                            ewvgVar4.b |= 2;
                                                                            ewvgVar4.e = b7;
                                                                        }
                                                                        if (exauVar.b() != null) {
                                                                            String b8 = exaq.b(exauVar.b());
                                                                            ewvdVar.copyOnWrite();
                                                                            ewvg ewvgVar5 = (ewvg) ewvdVar.instance;
                                                                            b8.getClass();
                                                                            ewvgVar5.b |= 4;
                                                                            ewvgVar5.f = b8;
                                                                        }
                                                                        if (exauVar.c() != null) {
                                                                            String b9 = exaq.b(exauVar.c());
                                                                            ewvdVar.copyOnWrite();
                                                                            ewvg ewvgVar6 = (ewvg) ewvdVar.instance;
                                                                            b9.getClass();
                                                                            ewvgVar6.b |= 8;
                                                                            ewvgVar6.g = b9;
                                                                        }
                                                                        ewvgVar = (ewvg) ewvdVar.build();
                                                                    }
                                                                    if (assetFileDescriptor == null) {
                                                                        textClassifierLibImpl.l();
                                                                    } else {
                                                                        try {
                                                                            AnnotatorModel annotatorModel = new AnnotatorModel(assetFileDescriptor);
                                                                            if (ewvgVar != null) {
                                                                                if (!annotatorModel.nativeInitializeKnowledgeEngine(annotatorModel.a, ewvgVar.toByteArray())) {
                                                                                    throw new IllegalArgumentException("Couldn't initialize the KG engine");
                                                                                }
                                                                            }
                                                                            if (ewuyVar != null) {
                                                                                if (parcelFileDescriptor != null) {
                                                                                    String uri = ((Uri) efca.a(parcelFileDescriptor).first).toString();
                                                                                    emam emamVar = (emam) emao.a.createBuilder();
                                                                                    emamVar.copyOnWrite();
                                                                                    emao emaoVar = (emao) emamVar.instance;
                                                                                    uri.getClass();
                                                                                    emaoVar.b |= 1;
                                                                                    emaoVar.c = uri;
                                                                                    emao emaoVar2 = (emao) emamVar.build();
                                                                                    ewuv ewuvVar = (ewuv) ewuyVar.toBuilder();
                                                                                    ewuvVar.copyOnWrite();
                                                                                    ewuy ewuyVar2 = (ewuy) ewuvVar.instance;
                                                                                    emaoVar2.getClass();
                                                                                    ewuyVar2.l = emaoVar2;
                                                                                    ewuyVar2.b |= 256;
                                                                                    ewuyVar = (ewuy) ewuvVar.build();
                                                                                }
                                                                                if (parcelFileDescriptor2 != null) {
                                                                                    String uri2 = ((Uri) efca.a(parcelFileDescriptor2).first).toString();
                                                                                    ewuv ewuvVar2 = (ewuv) ewuyVar.toBuilder();
                                                                                    ewuvVar2.copyOnWrite();
                                                                                    ewuy ewuyVar3 = (ewuy) ewuvVar2.instance;
                                                                                    uri2.getClass();
                                                                                    ewuyVar3.b |= 1024;
                                                                                    ewuyVar3.m = uri2;
                                                                                    ewuyVar = (ewuy) ewuvVar2.build();
                                                                                }
                                                                                if (!annotatorModel.nativeInitializeContactEngine(annotatorModel.a, ewuyVar.toByteArray())) {
                                                                                    throw new IllegalArgumentException("Couldn't initialize the contact engine");
                                                                                }
                                                                            }
                                                                            if (assetFileDescriptor2 != null && !annotatorModel.nativeInitializePersonNameEngine(annotatorModel.a, assetFileDescriptor2.getParcelFileDescriptor().getFd(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength())) {
                                                                                throw new IllegalArgumentException("Couldn't initialize the person name engine");
                                                                            }
                                                                            int nativeGetVersionWithOffset = AnnotatorModel.nativeGetVersionWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                                            String nativeGetLocalesWithOffset = AnnotatorModel.nativeGetLocalesWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                                            textClassifierLibImpl.k.c(annotatorModel);
                                                                            textClassifierLibImpl.g.writeLock().lock();
                                                                            try {
                                                                                textClassifierLibImpl.l();
                                                                                textClassifierLibImpl.j = annotatorModel;
                                                                                textClassifierLibImpl.l = new ewut(nativeGetVersionWithOffset, nativeGetLocalesWithOffset);
                                                                                Log.d("TextClassifierLibImpl", a.t(textClassifierLibImpl.l.a, "Loaded annotator model: "));
                                                                            } finally {
                                                                                textClassifierLibImpl.g.writeLock().unlock();
                                                                            }
                                                                        } catch (IllegalArgumentException e4) {
                                                                            throw new ewyg("Could not load model from ".concat(assetFileDescriptor.toString()), e4);
                                                                        }
                                                                    }
                                                                    a6.close();
                                                                    a5.close();
                                                                    a4.close();
                                                                    ewyhVar2.close();
                                                                    ewyhVar.close();
                                                                    return ewzx.a;
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                    ewyhVar = a2;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                th4 = th;
                                                                try {
                                                                    a5.close();
                                                                    throw th4;
                                                                } catch (Throwable th12) {
                                                                    th4.addSuppressed(th12);
                                                                    throw th4;
                                                                }
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            ewyhVar = a2;
                                                            ewyhVar2 = a3;
                                                            th4 = th;
                                                            a5.close();
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        th3 = th;
                                                        try {
                                                            a4.close();
                                                            throw th3;
                                                        } catch (Throwable th15) {
                                                            th3.addSuppressed(th15);
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                    ewyhVar = a2;
                                                    ewyhVar2 = a3;
                                                    th3 = th;
                                                    a4.close();
                                                    throw th3;
                                                }
                                            } catch (Throwable th17) {
                                                th = th17;
                                                th2 = th;
                                                try {
                                                    ewyhVar2.close();
                                                    throw th2;
                                                } catch (Throwable th18) {
                                                    th2.addSuppressed(th18);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th19) {
                                            th = th19;
                                            ewyhVar = a2;
                                            ewyhVar2 = a3;
                                            th2 = th;
                                            ewyhVar2.close();
                                            throw th2;
                                        }
                                    } catch (Throwable th20) {
                                        th = th20;
                                        th = th;
                                        try {
                                            ewyhVar.close();
                                            throw th;
                                        } catch (Throwable th21) {
                                            th.addSuppressed(th21);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
                                    ewyhVar = a2;
                                    th = th;
                                    ewyhVar.close();
                                    throw th;
                                }
                            } catch (ewyg e5) {
                                throw new ewyn("Failed to load the native annotator.", e5);
                            }
                        }
                    }, errlVar);
                    ListenableFuture f2 = erny.f(erre.a, new emwl() { // from class: ewzr
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r11v12, types: [java.util.concurrent.locks.Lock] */
                        /* JADX WARN: Type inference failed for: r11v2, types: [com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl] */
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            LangIdModel langIdModel;
                            TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                            try {
                                ewyh a2 = ((ewvx) textClassifierLibImpl.d).e.a();
                                try {
                                    if (((ewvr) a2).a) {
                                        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) ((ewvr) a2).b;
                                        if (assetFileDescriptor != null) {
                                            try {
                                                langIdModel = new LangIdModel(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                            } catch (IllegalArgumentException e2) {
                                                throw new ewyg("Could not load LangId model from ".concat(assetFileDescriptor.toString()), e2);
                                            }
                                        } else {
                                            langIdModel = null;
                                        }
                                        textClassifierLibImpl.k.d(langIdModel);
                                        textClassifierLibImpl.h.writeLock().lock();
                                        try {
                                            if (langIdModel != null) {
                                                textClassifierLibImpl.n = langIdModel;
                                                textClassifierLibImpl.o = new ewut(langIdModel.a(), "*");
                                                Log.d("TextClassifierLibImpl", a.t(textClassifierLibImpl.o.a, "Loaded langID model: "));
                                            } else {
                                                textClassifierLibImpl.n = null;
                                                textClassifierLibImpl.o = null;
                                            }
                                            textClassifierLibImpl = textClassifierLibImpl.h.writeLock();
                                            textClassifierLibImpl.unlock();
                                        } catch (Throwable th) {
                                            textClassifierLibImpl.h.writeLock().unlock();
                                            throw th;
                                        }
                                    } else {
                                        Log.d("TextClassifierLibImpl", "Skipping asynchronous LangId reload. No model change.");
                                    }
                                    a2.close();
                                    return ewzx.a;
                                } finally {
                                }
                            } catch (ewyg e3) {
                                throw new ewyn("Failed to load the native LangId.", e3);
                            }
                        }
                    }, errlVar);
                    ListenableFuture listenableFuture2 = erre.a;
                    return erny.f(erqt.f(f, f2, erny.f(erqt.f(listenableFuture2, listenableFuture2), new emwl() { // from class: ewzs
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            AssetFileDescriptor assetFileDescriptor;
                            ActionsSuggestionsModel actionsSuggestionsModel;
                            ewva ewvaVar;
                            TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                            try {
                                ewyh a2 = ((ewvx) textClassifierLibImpl.d).f.a();
                                try {
                                    ewyh a3 = ((ewvx) textClassifierLibImpl.d).k.a();
                                    try {
                                        try {
                                            if (!((ewvr) a2).a && !((ewvr) a3).a) {
                                                Log.d("TextClassifierLibImpl", "Skipping asynchronous actions model reload. No model change.");
                                                a3.close();
                                                a2.close();
                                                return ewzx.a;
                                            }
                                            textClassifierLibImpl.k();
                                            if (actionsSuggestionsModel != null) {
                                                int nativeGetVersionWithOffset = ActionsSuggestionsModel.nativeGetVersionWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                String nativeGetLocalesWithOffset = ActionsSuggestionsModel.nativeGetLocalesWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                                                textClassifierLibImpl.p = actionsSuggestionsModel;
                                                textClassifierLibImpl.q = new ewut(nativeGetVersionWithOffset, nativeGetLocalesWithOffset);
                                                Log.d("TextClassifierLibImpl", a.t(textClassifierLibImpl.q.a, "Loaded actions model: "));
                                            }
                                            a3.close();
                                            a2.close();
                                            return ewzx.a;
                                        } finally {
                                            textClassifierLibImpl.i.writeLock().unlock();
                                        }
                                        assetFileDescriptor = (AssetFileDescriptor) ((ewvr) a2).b;
                                        ewxf ewxfVar = (ewxf) ((ewvr) a3).b;
                                        actionsSuggestionsModel = null;
                                        if (ewxfVar == null) {
                                            ewvaVar = null;
                                        } else {
                                            ewuz ewuzVar = (ewuz) ewva.a.createBuilder();
                                            String b2 = ewvn.b(ewxfVar.b());
                                            ewuzVar.copyOnWrite();
                                            ewva ewvaVar2 = (ewva) ewuzVar.instance;
                                            b2.getClass();
                                            ewvaVar2.b |= 1;
                                            ewvaVar2.c = b2;
                                            String b3 = ewvn.b(ewxfVar.a());
                                            ewuzVar.copyOnWrite();
                                            ewva ewvaVar3 = (ewva) ewuzVar.instance;
                                            b3.getClass();
                                            ewvaVar3.b |= 2;
                                            ewvaVar3.d = b3;
                                            ewvaVar = (ewva) ewuzVar.build();
                                        }
                                        if (assetFileDescriptor != null) {
                                            try {
                                                actionsSuggestionsModel = new ActionsSuggestionsModel(assetFileDescriptor);
                                                if (ewvaVar != null) {
                                                    if (!actionsSuggestionsModel.nativeInitializeConversationIntentDetection(actionsSuggestionsModel.a, ewvaVar.toByteArray())) {
                                                        throw new IllegalArgumentException("Couldn't initialize conversation intent detection");
                                                    }
                                                }
                                            } catch (IllegalArgumentException e2) {
                                                throw new ewyg("Could not load actions model from ".concat(assetFileDescriptor.toString()), e2);
                                            }
                                        }
                                        textClassifierLibImpl.k.b(actionsSuggestionsModel);
                                        textClassifierLibImpl.i.writeLock().lock();
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (ewyg e3) {
                                throw new ewyn("Failed to load the native actions model.", e3);
                            }
                        }
                    }, errlVar), erny.f(erqt.f(f, f2), new emwl() { // from class: ewzt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            AnnotatorModel annotatorModel;
                            TextClassifierLibImpl textClassifierLibImpl = TextClassifierLibImpl.this;
                            textClassifierLibImpl.g.writeLock().lock();
                            textClassifierLibImpl.h.readLock().lock();
                            try {
                                LangIdModel langIdModel = textClassifierLibImpl.n;
                                if (langIdModel != null && (annotatorModel = textClassifierLibImpl.j) != null) {
                                    annotatorModel.b = langIdModel;
                                    annotatorModel.nativeSetLangId(annotatorModel.a, langIdModel.a);
                                }
                                textClassifierLibImpl.h.readLock().unlock();
                                textClassifierLibImpl.g.writeLock().unlock();
                                return ewzx.a;
                            } catch (Throwable th) {
                                textClassifierLibImpl.h.readLock().unlock();
                                textClassifierLibImpl.g.writeLock().unlock();
                                throw th;
                            }
                        }
                    }, errlVar)), new emwl() { // from class: ewzu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            engw engwVar = TextClassifierLibImpl.a;
                            return ewzx.a;
                        }
                    }, errlVar);
                } catch (Throwable th) {
                    this.x.writeLock().unlock();
                    throw th;
                }
            } catch (UnsatisfiedLinkError e2) {
                ListenableFuture h = erqt.h(e2);
                this.x.writeLock().unlock();
                return h;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018e A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019b A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b4 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e6 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ef A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f6 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d9 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03fe A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0401 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:9:0x0042, B:11:0x0046, B:12:0x0082, B:14:0x0086, B:19:0x00a5, B:21:0x00c8, B:22:0x02e6, B:24:0x0336, B:26:0x034c, B:28:0x0354, B:30:0x0360, B:35:0x0374, B:36:0x042c, B:38:0x0432, B:39:0x043d, B:43:0x0383, B:44:0x0390, B:46:0x0396, B:49:0x039e, B:54:0x03ae, B:55:0x03b2, B:60:0x03fe, B:61:0x0401, B:62:0x03c0, B:65:0x03c9, B:68:0x03d5, B:70:0x03d8, B:74:0x03e0, B:76:0x03e3, B:80:0x03ec, B:83:0x03ef, B:90:0x045b, B:91:0x0464, B:92:0x00d3, B:94:0x00d9, B:96:0x00f5, B:98:0x00f8, B:100:0x0104, B:102:0x0108, B:104:0x02c1, B:105:0x02c5, B:107:0x02cb, B:110:0x02d9, B:116:0x0110, B:117:0x011e, B:119:0x012d, B:121:0x013a, B:125:0x021c, B:126:0x0151, B:128:0x0155, B:129:0x0157, B:131:0x015d, B:132:0x015f, B:134:0x016a, B:136:0x016e, B:137:0x0170, B:141:0x017e, B:143:0x018e, B:144:0x0190, B:146:0x019b, B:147:0x01a3, B:149:0x01b4, B:150:0x01b9, B:152:0x01c1, B:154:0x01c9, B:155:0x01de, B:157:0x01e6, B:158:0x01eb, B:160:0x01ef, B:161:0x01f2, B:163:0x01f6, B:164:0x0202, B:167:0x01d1, B:169:0x01d9, B:174:0x02a4, B:175:0x022a, B:176:0x0233, B:178:0x0239, B:181:0x0247, B:183:0x025f, B:184:0x0264, B:186:0x027b, B:187:0x0288, B:194:0x02aa, B:195:0x02b1, B:196:0x02b2, B:198:0x02b8, B:199:0x02bd, B:32:0x036e, B:34:0x0372, B:42:0x037f), top: B:8:0x0042, inners: #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ewyx i(defpackage.ewys r31) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.i(ewys):ewyx");
    }

    public final exaf j(exae exaeVar) {
        if (r) {
            Log.d("TextClassifierLibImpl", "detectLanguage in PID " + Process.myPid());
        }
        exaeVar.getClass();
        try {
            this.c.get();
            o();
            String charSequence = exaeVar.a().toString();
            ewvz ewvzVar = new ewvz();
            this.h.readLock().lock();
            try {
                LangIdModel langIdModel = this.n;
                if (langIdModel != null) {
                    for (LangIdModel.LanguageResult languageResult : langIdModel.nativeDetectLanguages(langIdModel.a, charSequence)) {
                        Locale locale = new Locale(languageResult.a);
                        float f = languageResult.b;
                        if (ewvzVar.a == null) {
                            int i = engw.d;
                            ewvzVar.a = new engr();
                        }
                        ewvzVar.a.h(new ewwb(locale, f));
                    }
                }
                return ewvzVar.a();
            } finally {
                this.h.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (!((ewvx) this.d).a) {
                throw new IllegalStateException("Failed to initialize.", e);
            }
            Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
            return new ewvz().a();
        }
    }

    public final void k() {
        this.i.writeLock().lock();
        try {
            ActionsSuggestionsModel actionsSuggestionsModel = this.p;
            if (actionsSuggestionsModel != null) {
                actionsSuggestionsModel.close();
                this.p = null;
                this.q = null;
            }
        } finally {
            this.i.writeLock().unlock();
        }
    }

    public final void l() {
        this.g.writeLock().lock();
        try {
            AnnotatorModel annotatorModel = this.j;
            if (annotatorModel != null) {
                annotatorModel.close();
                this.j = null;
                this.l = null;
            }
        } finally {
            this.g.writeLock().unlock();
        }
    }
}
