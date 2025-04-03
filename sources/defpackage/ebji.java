package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebji extends ote {
    final /* synthetic */ EducationDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebji(EducationDatabase_Impl educationDatabase_Impl) {
        super(2, "eeffbce3bfbd69ea1ae982695ce17aa1", "8748339cfd9b753a6ac6868ce101ce6c");
        this.d = educationDatabase_Impl;
    }

    @Override // defpackage.ote
    public final otd a(ouz ouzVar) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("name", new owi("name", "TEXT", true, 1, null, 1));
        hashMap.put("enabled", new owi("enabled", "INTEGER", true, 0, null, 1));
        hashMap.put("numEducationImpressions", new owi("numEducationImpressions", "INTEGER", true, 0, null, 1));
        hashMap.put("numEducationInteractions", new owi("numEducationInteractions", "INTEGER", true, 0, null, 1));
        hashMap.put("activatedTimestampMs", new owi("activatedTimestampMs", "INTEGER", true, 0, null, 1));
        hashMap.put("lastImpressionTimestampMs", new owi("lastImpressionTimestampMs", "INTEGER", true, 0, null, 1));
        hashMap.put("lastInteractionTimestampMs", new owi("lastInteractionTimestampMs", "INTEGER", true, 0, null, 1));
        hashMap.put("educationCompleted", new owi("educationCompleted", "INTEGER", true, 0, null, 1));
        owl owlVar = new owl("EducationState", hashMap, new HashSet(0), new HashSet(0));
        owl a = owg.a(ouzVar, "EducationState");
        if (!owo.f(owlVar, a)) {
            return new otd(false, a.O(a, owlVar, "EducationState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationState).\n Expected:\n"));
        }
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("educationName", new owi("educationName", "TEXT", true, 1, null, 1));
        hashMap2.put("highlightId", new owi("highlightId", "TEXT", true, 2, null, 1));
        hashMap2.put("numHighlightImpressions", new owi("numHighlightImpressions", "INTEGER", true, 0, null, 1));
        hashMap2.put("numHighlightInteractions", new owi("numHighlightInteractions", "INTEGER", true, 0, null, 1));
        hashMap2.put("highlightCompleted", new owi("highlightCompleted", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new owj("EducationState", "CASCADE", "NO ACTION", Arrays.asList("educationName"), Arrays.asList("name")));
        owl owlVar2 = new owl("HighlightState", hashMap2, hashSet, new HashSet(0));
        owl a2 = owg.a(ouzVar, "HighlightState");
        return !owo.f(owlVar2, a2) ? new otd(false, a.O(a2, owlVar2, "HighlightState(com.google.android.libraries.onegoogle.accountmenu.features.education.db.HighlightState).\n Expected:\n")) : new otd(true, null);
    }

    @Override // defpackage.ote
    public final void b(ouz ouzVar) {
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `EducationState` (`name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `numEducationImpressions` INTEGER NOT NULL, `numEducationInteractions` INTEGER NOT NULL, `activatedTimestampMs` INTEGER NOT NULL, `lastImpressionTimestampMs` INTEGER NOT NULL, `lastInteractionTimestampMs` INTEGER NOT NULL, `educationCompleted` INTEGER NOT NULL, PRIMARY KEY(`name`))");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS `HighlightState` (`educationName` TEXT NOT NULL, `highlightId` TEXT NOT NULL, `numHighlightImpressions` INTEGER NOT NULL, `numHighlightInteractions` INTEGER NOT NULL, `highlightCompleted` INTEGER NOT NULL, PRIMARY KEY(`educationName`, `highlightId`), FOREIGN KEY(`educationName`) REFERENCES `EducationState`(`name`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        oxe.a(ouzVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxe.a(ouzVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eeffbce3bfbd69ea1ae982695ce17aa1')");
    }

    @Override // defpackage.ote
    public final void c(ouz ouzVar) {
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `EducationState`");
        oxe.a(ouzVar, "DROP TABLE IF EXISTS `HighlightState`");
    }

    @Override // defpackage.ote
    public final void d(ouz ouzVar) {
        oxe.a(ouzVar, "PRAGMA foreign_keys = ON");
        this.d.u(ouzVar);
    }

    @Override // defpackage.ote
    public final void e(ouz ouzVar) {
        ovo.a(ouzVar);
    }

    @Override // defpackage.ote
    public final void f() {
    }

    @Override // defpackage.ote
    public final void g() {
    }
}
