package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.ActivityStackAttributes;
import androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams;
import androidx.window.extensions.embedding.ParentContainerInfo;
import androidx.window.extensions.embedding.WindowAttributes;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class piw {
    public final ActivityEmbeddingComponent a;
    public final phm b;
    public final ReentrantLock c;
    public final Map d;
    public final ArrayMap e;
    public final ArrayMap f;

    public piw(ActivityEmbeddingComponent activityEmbeddingComponent, phm phmVar) {
        activityEmbeddingComponent.getClass();
        this.a = activityEmbeddingComponent;
        this.b = phmVar;
        this.c = new ReentrantLock();
        this.d = new ArrayMap();
        this.e = new ArrayMap();
        this.f = new ArrayMap();
        new ArrayMap();
        new pgk().a(8);
        activityEmbeddingComponent.setActivityStackAttributesCalculator(new Function() { // from class: pit
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                ParentContainerInfo parentContainerInfo;
                Configuration configuration;
                WindowMetrics windowMetrics;
                WindowMetrics windowMetrics2;
                String activityStackTag;
                Bundle launchOptions;
                ParentContainerInfo parentContainerInfo2;
                WindowMetrics windowMetrics3;
                ParentContainerInfo parentContainerInfo3;
                Configuration configuration2;
                WindowLayoutInfo windowLayoutInfo;
                Bundle launchOptions2;
                Configuration configuration3;
                Configuration configuration4;
                WindowMetrics windowMetrics4;
                WindowMetrics windowMetrics5;
                WindowLayoutInfo windowLayoutInfo2;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                pgm a;
                ActivityStackAttributes.Builder relativeBounds;
                ActivityStackAttributes.Builder windowAttributes;
                ActivityStackAttributes build;
                ActivityStackAttributesCalculatorParams m607m = pgq$$ExternalSyntheticApiModelOutline0.m607m(obj);
                piw piwVar = piw.this;
                ReentrantLock reentrantLock = piwVar.c;
                reentrantLock.lock();
                try {
                    parentContainerInfo = m607m.getParentContainerInfo();
                    parentContainerInfo.getClass();
                    pnq a2 = pnp.a();
                    configuration = parentContainerInfo.getConfiguration();
                    configuration.getClass();
                    windowMetrics = parentContainerInfo.getWindowMetrics();
                    windowMetrics.getClass();
                    float b = a2.b(configuration, windowMetrics);
                    pmf pmfVar = pmg.a;
                    windowMetrics2 = parentContainerInfo.getWindowMetrics();
                    windowMetrics2.getClass();
                    pme a3 = pmfVar.a(windowMetrics2, b);
                    activityStackTag = m607m.getActivityStackTag();
                    activityStackTag.getClass();
                    launchOptions = m607m.getLaunchOptions();
                    launchOptions.getClass();
                    Bundle bundle = launchOptions.getBundle("androidx.window.embedding.EmbeddingBounds");
                    pic picVar = bundle == null ? null : new pic(new phw(bundle.getInt("androidx.window.embedding.EmbeddingBounds.alignment")), pgy.a(bundle, "androidx.window.embedding.EmbeddingBounds.width"), pgy.a(bundle, "androidx.window.embedding.EmbeddingBounds.height"));
                    pis pisVar = picVar == null ? null : new pis(picVar);
                    pmf pmfVar2 = pmg.a;
                    parentContainerInfo2 = m607m.getParentContainerInfo();
                    windowMetrics3 = parentContainerInfo2.getWindowMetrics();
                    windowMetrics3.getClass();
                    pmfVar2.a(windowMetrics3, b);
                    parentContainerInfo3 = m607m.getParentContainerInfo();
                    configuration2 = parentContainerInfo3.getConfiguration();
                    configuration2.getClass();
                    windowLayoutInfo = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo.getClass();
                    pmq.a(a3, windowLayoutInfo);
                    pis pisVar2 = (pis) piwVar.d.get(activityStackTag);
                    if (pisVar2 != null) {
                        pisVar = pisVar2;
                    } else if (pisVar == null) {
                        throw new IllegalArgumentException("Can't retrieve overlay attributes from launch options");
                    }
                    ReentrantLock reentrantLock2 = piwVar.c;
                    reentrantLock2.lock();
                    reentrantLock2.unlock();
                    piwVar.e.put(activityStackTag, pisVar);
                    launchOptions2 = m607m.getLaunchOptions();
                    launchOptions2.getClass();
                    launchOptions2.putInt("androidx.window.embedding.ActivityStackAlignment", pisVar.a.b.e);
                    ActivityStackAttributes.Builder builder = new ActivityStackAttributes.Builder();
                    pic picVar2 = pisVar.a;
                    phm phmVar2 = piwVar.b;
                    configuration3 = parentContainerInfo.getConfiguration();
                    configuration3.getClass();
                    pnq a4 = pnp.a();
                    configuration4 = parentContainerInfo.getConfiguration();
                    configuration4.getClass();
                    windowMetrics4 = parentContainerInfo.getWindowMetrics();
                    windowMetrics4.getClass();
                    float b2 = a4.b(configuration4, windowMetrics4);
                    pmf pmfVar3 = pmg.a;
                    windowMetrics5 = parentContainerInfo.getWindowMetrics();
                    windowMetrics5.getClass();
                    pme a5 = pmfVar3.a(windowMetrics5, b2);
                    pgm pgmVar = new pgm(a5.a());
                    windowLayoutInfo2 = parentContainerInfo.getWindowLayoutInfo();
                    windowLayoutInfo2.getClass();
                    pix pixVar = new pix(pgmVar, pmq.a(a5, windowLayoutInfo2), configuration3, b2);
                    pgm pgmVar2 = pixVar.a;
                    pmd pmdVar = pixVar.b;
                    if (ffkj.e(picVar2.c, pib.b) && ffkj.e(picVar2.d, pib.b)) {
                        a = pgm.a;
                        i = 2;
                    } else {
                        pic picVar3 = new pic(picVar2.b, picVar2.b(pmdVar) ? new pia(0.5f) : picVar2.c, picVar2.a(pmdVar) ? new pia(0.5f) : picVar2.d);
                        int b3 = pgmVar2.b();
                        Object piaVar = picVar3.b(pmdVar) ? new pia(0.5f) : picVar3.c;
                        i = 2;
                        if (piaVar instanceof pia) {
                            i2 = ((pia) piaVar).a(b3);
                        } else if (piaVar instanceof phz) {
                            i2 = Math.min(b3, ((phz) piaVar).a);
                        } else {
                            if (!ffkj.e(piaVar, pib.c)) {
                                pib pibVar = picVar3.c;
                                Objects.toString(pibVar);
                                throw new IllegalArgumentException("Unhandled width dimension=".concat(pibVar.toString()));
                            }
                            plm c = pic.c(pmdVar);
                            c.getClass();
                            Rect a6 = c.a();
                            phw phwVar = picVar3.b;
                            if (ffkj.e(phwVar, phw.a)) {
                                i2 = a6.left - pgmVar2.b;
                            } else {
                                if (!ffkj.e(phwVar, phw.c)) {
                                    throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + picVar3 + " taskBounds=" + pgmVar2 + " windowLayoutInfo=" + pmdVar);
                                }
                                i2 = pgmVar2.d - a6.right;
                            }
                        }
                        int a7 = pgmVar2.a();
                        Object piaVar2 = picVar3.a(pmdVar) ? new pia(0.5f) : picVar3.d;
                        if (piaVar2 instanceof pia) {
                            i5 = ((pia) piaVar2).a(a7);
                        } else if (piaVar2 instanceof phz) {
                            i5 = Math.min(a7, ((phz) piaVar2).a);
                        } else {
                            if (!ffkj.e(piaVar2, pib.c)) {
                                pib pibVar2 = picVar3.c;
                                Objects.toString(pibVar2);
                                throw new IllegalArgumentException("Unhandled width dimension=".concat(pibVar2.toString()));
                            }
                            plm c2 = pic.c(pmdVar);
                            c2.getClass();
                            Rect a8 = c2.a();
                            phw phwVar2 = picVar3.b;
                            if (ffkj.e(phwVar2, phw.b)) {
                                i3 = a8.top;
                                i4 = pgmVar2.c;
                            } else {
                                if (!ffkj.e(phwVar2, phw.d)) {
                                    throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + picVar3 + " taskBounds=" + pgmVar2 + " windowLayoutInfo=" + pmdVar);
                                }
                                i3 = pgmVar2.e;
                                i4 = a8.bottom;
                            }
                            i5 = i3 - i4;
                        }
                        int b4 = pgmVar2.b();
                        int a9 = pgmVar2.a();
                        if (i2 == b4 && i5 == a9) {
                            a = pgm.a;
                        } else {
                            pgm pgmVar3 = new pgm(0, 0, i2, i5);
                            phw phwVar3 = picVar2.b;
                            if (ffkj.e(phwVar3, phw.b)) {
                                a = phx.a(pgmVar3, (b4 - i2) / 2, 0);
                            } else if (ffkj.e(phwVar3, phw.a)) {
                                a = phx.a(pgmVar3, 0, (a9 - i5) / 2);
                            } else if (ffkj.e(phwVar3, phw.d)) {
                                a = phx.a(pgmVar3, (b4 - i2) / 2, a9 - i5);
                            } else {
                                if (!ffkj.e(phwVar3, phw.c)) {
                                    phw phwVar4 = picVar2.b;
                                    Objects.toString(phwVar4);
                                    throw new IllegalArgumentException("Unknown alignment: ".concat(phwVar4.toString()));
                                }
                                a = phx.a(pgmVar3, b4 - i2, (a9 - i5) / 2);
                            }
                        }
                    }
                    relativeBounds = builder.setRelativeBounds(a.c());
                    phm phmVar3 = piwVar.b;
                    new pgk().a(5);
                    windowAttributes = relativeBounds.setWindowAttributes(new WindowAttributes(true != ffkj.e(null, pil.a) ? i : 1));
                    build = windowAttributes.build();
                    build.getClass();
                    return build;
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        activityEmbeddingComponent.registerActivityStackCallback(new Executor() { // from class: piu
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new Consumer() { // from class: piv
            @Override // androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                ActivityStack.Token activityStackToken;
                String tag;
                String tag2;
                piw piwVar = piw.this;
                List list = (List) obj;
                ReentrantLock reentrantLock = piwVar.c;
                reentrantLock.lock();
                try {
                    Set<String> keySet = piwVar.f.keySet();
                    keySet.getClass();
                    piwVar.f.clear();
                    ArrayMap arrayMap = piwVar.f;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        tag2 = pgq$$ExternalSyntheticApiModelOutline0.m606m(obj2).getTag();
                        if (tag2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                    List ak = ffdx.ak(arrayList);
                    ArrayList arrayList2 = new ArrayList(ffdx.n(ak, 10));
                    Iterator it = ak.iterator();
                    while (it.hasNext()) {
                        ActivityStack m606m = pgq$$ExternalSyntheticApiModelOutline0.m606m(it.next());
                        tag = m606m.getTag();
                        tag.getClass();
                        arrayList2.add(new ffcf(tag, m606m));
                    }
                    ffew.n(arrayMap, arrayList2);
                    if (!keySet.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        Set keySet2 = piwVar.f.keySet();
                        keySet2.getClass();
                        for (String str : keySet) {
                            if (!keySet2.contains(str)) {
                                activityStackToken = piwVar.a.getActivityStackToken(str);
                                if (activityStackToken == null) {
                                    arrayList3.add(str);
                                }
                            }
                        }
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            String str2 = (String) arrayList3.get(i);
                            piwVar.d.remove(str2);
                            piwVar.e.remove(str2);
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
    }
}
